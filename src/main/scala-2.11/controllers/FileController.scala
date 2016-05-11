package controllers

import com.twitter.finagle.http.{Request}
import com.twitter.finatra.http.Controller
import views.{GalleryView, BootstrapView, ImageView}

class FileController extends Controller {
  get("/:*") { request: Request =>
    response.ok.fileOrIndex(request.params("*"), "public/index.html")
  }

  val imageView = new ImageView

  get("/file") { request: Request =>
    imageView.fragment.toString()
  }

  val bootstrap = new BootstrapView
  get("/bootstrap") { request : Request =>
    "<!DOCTYPE html>" + bootstrap.page.toString()
  }

  val gallery = new GalleryView
  get("/gallery") { request : Request =>
    "<!DOCTYPE html>" + gallery.page.toString()
  }
}
