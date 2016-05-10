package controllers

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller
import views.{LoopView, ExampleScalaTags, HelloPage}

class TagsTestController extends Controller {
  val view1 = new HelloPage
  val view2 = new ExampleScalaTags
  val view3 = new LoopView

  get("/tags"){ request:Request =>
    view1.fragment.toString()
  }

  get("/tagz"){ request:Request =>
    view2.htmlFrag.toString()
  }

  get("/loop"){ request:Request =>
    view3.fragment.toString()
  }

}
