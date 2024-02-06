package com.health_care.app.modules.scheduletabcontainer.`data`.model

import com.health_care.app.R
import com.health_care.app.appcomponents.di.MyApp
import kotlin.String

data class ScheduleTabContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSchedule: String? = MyApp.getInstance().resources.getString(R.string.lbl_schedule)

)
