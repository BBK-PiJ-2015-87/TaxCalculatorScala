package controllers

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller
import views.HelloPage

class TagsTestController extends Controller {
  val view = new HelloPage

  get("/tags"){ request:Request =>
    view.fragment.toString()
  }

}
