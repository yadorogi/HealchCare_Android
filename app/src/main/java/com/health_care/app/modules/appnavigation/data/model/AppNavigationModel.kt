package com.health_care.app.modules.appnavigation.`data`.model

import com.health_care.app.R
import com.health_care.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSplashScreen: String? = MyApp.getInstance().resources.getString(R.string.lbl_splash_screen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignup: String? = MyApp.getInstance().resources.getString(R.string.lbl_signup2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrList: String? = MyApp.getInstance().resources.getString(R.string.lbl_dr_list)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_dr_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBookAnAppointment: String? =
      MyApp.getInstance().resources.getString(R.string.msg_book_an_appoint)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChat: String? = MyApp.getInstance().resources.getString(R.string.lbl_chat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPharmacy: String? = MyApp.getInstance().resources.getString(R.string.lbl_pharmacy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrugDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_drug_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArticle: String? = MyApp.getInstance().resources.getString(R.string.lbl_article)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmbulance: String? = MyApp.getInstance().resources.getString(R.string.lbl_ambulance2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDashboardContainer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dashboard_con)

)
