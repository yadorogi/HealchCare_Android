package com.health_care.app.modules.message.`data`.model

import com.health_care.app.R
import com.health_care.app.appcomponents.di.MyApp
import kotlin.String

data class ChatlistRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrMarcusHorizon: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_marcus_horizon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIDonTHaveAny: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_don_t_have_any2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_24)

)
