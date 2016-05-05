package controllers

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

/**
  * Created by vladimirsivanovs on 05/05/2016.
  */
class TaxController extends Controller {
  get("/tax") { request: Request =>
    "Vlad says hello"
  }
}
