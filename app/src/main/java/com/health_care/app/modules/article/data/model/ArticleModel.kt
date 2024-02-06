package com.health_care.app.modules.article.`data`.model

import com.health_care.app.R
import com.health_care.app.appcomponents.di.MyApp
import kotlin.String

data class ArticleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTopDoctor: String? = MyApp.getInstance().resources.getString(R.string.lbl_articles)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularArticles: String? =
      MyApp.getInstance().resources.getString(R.string.msg_popular_articles)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrendingArticles: String? =
      MyApp.getInstance().resources.getString(R.string.msg_trending_articles)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRelatedArticles: String? =
      MyApp.getInstance().resources.getString(R.string.msg_related_articles)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll1: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)
