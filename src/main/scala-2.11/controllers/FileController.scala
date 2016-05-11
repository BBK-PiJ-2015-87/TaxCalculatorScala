package controllers

import com.twitter.finagle.http.{Request}
import com.twitter.finatra.http.Controller
import views.{GalleryView, BootstrapView}

class FileController extends Controller {
  val gallery = new GalleryView
  val bootstrap = new BootstrapView

  get("/:*") { request: Request =>
    response.ok.fileOrIndex(request.params("*"), "public/index.html")
  }

  get("/bootstrap") { request : Request =>
    "<!DOCTYPE html>" + bootstrap.page.toString()
  }

  get("/gallery") { request : Request =>
    "<!DOCTYPE html>" + gallery.page.toString()
  }
}
