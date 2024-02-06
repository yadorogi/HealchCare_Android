package com.health_care.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.health_care.app.R
import com.health_care.app.appcomponents.base.BaseActivity
import com.health_care.app.databinding.ActivityAppNavigationBinding
import com.health_care.app.modules.ambulance.ui.AmbulanceActivity
import com.health_care.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.health_care.app.modules.article.ui.ArticleActivity
import com.health_care.app.modules.bookanappointment.ui.BookAnAppointmentActivity
import com.health_care.app.modules.cart.ui.CartActivity
import com.health_care.app.modules.chat.ui.ChatActivity
import com.health_care.app.modules.dashboardcontainer.ui.DashboardContainerActivity
import com.health_care.app.modules.drdetails.ui.DrDetailsActivity
import com.health_care.app.modules.drlist.ui.DrListActivity
import com.health_care.app.modules.drugdetails.ui.DrugDetailsActivity
import com.health_care.app.modules.login.ui.LoginActivity
import com.health_care.app.modules.pharmacy.ui.PharmacyActivity
import com.health_care.app.modules.signup.ui.SignupActivity
import com.health_care.app.modules.splashscreen.ui.SplashScreenActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearSplashScreen.setOnClickListener {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDashboardContainer.setOnClickListener {
      val destIntent = DashboardContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDrDetails.setOnClickListener {
      val destIntent = DrDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAmbulance.setOnClickListener {
      val destIntent = AmbulanceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearArticle.setOnClickListener {
      val destIntent = ArticleActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBookAnAppointment.setOnClickListener {
      val destIntent = BookAnAppointmentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCart.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignup.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDrList.setOnClickListener {
      val destIntent = DrListActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPharmacy.setOnClickListener {
      val destIntent = PharmacyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearChat.setOnClickListener {
      val destIntent = ChatActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDrugDetails.setOnClickListener {
      val destIntent = DrugDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
