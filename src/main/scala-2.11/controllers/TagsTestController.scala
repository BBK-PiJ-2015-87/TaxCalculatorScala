package controllers

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller
import views.{ ExampleScalaTags}

class TagsTestController extends Controller {
  val view2 = new ExampleScalaTags

  get("/tags"){ request:Request =>
    view2.htmlFrag.toString()
  }
}
