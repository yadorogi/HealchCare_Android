package com.health_care.app.modules.message.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.health_care.app.R
import com.health_care.app.appcomponents.base.BaseFragment
import com.health_care.app.databinding.FragmentMessageBinding
import com.health_care.app.modules.chat.ui.ChatActivity
import com.health_care.app.modules.message.`data`.model.ChatlistRowModel
import com.health_care.app.modules.message.`data`.viewmodel.MessageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MessageFragment : BaseFragment<FragmentMessageBinding>(R.layout.fragment_message) {
  private val viewModel: MessageVM by viewModels<MessageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val chatListAdapter = ChatListAdapter(viewModel.chatListList.value?:mutableListOf())
    binding.recyclerChatList.adapter = chatListAdapter
    chatListAdapter.setOnItemClickListener(
    object : ChatListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ChatlistRowModel) {
        onClickRecyclerChatList(view, position, item)
      }
    }
    )
    viewModel.chatListList.observe(requireActivity()) {
      chatListAdapter.updateData(it)
    }
    binding.messageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerChatList(
    view: View,
    position: Int,
    item: ChatlistRowModel
  ): Unit {
    when(view.id) {
      R.id.linearChat ->  {
        val destIntent = ChatActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }
  }

  companion object {
    const val TAG: String = "MESSAGE_FRAGMENT"

  }
}
