package controllers

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class HelloController extends Controller{
  get("/hello") { request: Request =>
    "Vlad says hello"
  }
}
