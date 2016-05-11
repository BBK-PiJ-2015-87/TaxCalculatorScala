package controllers

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class HelloController extends Controller{
  get("/main") { request: Request =>
    request.path.toString
    response.ok.file("public/index.html")
  }
}
