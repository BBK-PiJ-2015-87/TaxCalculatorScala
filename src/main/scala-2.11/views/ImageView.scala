package views

import scalatags.Text.all._

class ImageView {

  val range = 1 to 10


  val fragment = {
    html(
      body(
        for (i <- range) yield div(
          img(src:= "public/icon.jpg", "width".attr := 100, "height".attr := 100))
      )
    )
  }

}
