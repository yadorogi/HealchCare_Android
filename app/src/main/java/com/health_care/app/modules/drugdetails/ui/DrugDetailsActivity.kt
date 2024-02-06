package com.health_care.app.modules.drugdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.health_care.app.R
import com.health_care.app.appcomponents.base.BaseActivity
import com.health_care.app.databinding.ActivityDrugDetailsBinding
import com.health_care.app.modules.cart.ui.CartActivity
import com.health_care.app.modules.drugdetails.`data`.viewmodel.DrugDetailsVM
import kotlin.String
import kotlin.Unit

class DrugDetailsActivity : BaseActivity<ActivityDrugDetailsBinding>(R.layout.activity_drug_details)
    {
  private val viewModel: DrugDetailsVM by viewModels<DrugDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.drugDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBuyNow.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageCart.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DRUG_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DrugDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
