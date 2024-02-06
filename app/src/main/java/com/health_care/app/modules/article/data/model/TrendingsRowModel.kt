package com.health_care.app.modules.article.`data`.model

import com.health_care.app.R
import com.health_care.app.appcomponents.di.MyApp
import kotlin.String

data class TrendingsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCovidNineteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_covid_19)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_comparing_the_astrazeneca)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_jun_12_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_6_min_read)

)
