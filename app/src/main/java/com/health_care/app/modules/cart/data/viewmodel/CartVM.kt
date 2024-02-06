package com.health_care.app.modules.cart.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.health_care.app.modules.cart.`data`.model.CartModel
import com.health_care.app.modules.cart.`data`.model.DrugslistRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CartVM : ViewModel(), KoinComponent {
  val cartModel: MutableLiveData<CartModel> = MutableLiveData(CartModel())

  var navArguments: Bundle? = null

  val drugsListList: MutableLiveData<MutableList<DrugslistRowModel>> =
      MutableLiveData(mutableListOf())
}
