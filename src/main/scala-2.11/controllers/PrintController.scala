package controllers

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller
import views.PrintView

/**
  * Created by Workstation on 11/05/2016.
  */
class PrintController extends Controller {
  val pageToPrint = new PrintView;
  get("/print") { request: Request =>
      "<!DOCTYPE html>" + pageToPrint.page.toString()
  }
}
