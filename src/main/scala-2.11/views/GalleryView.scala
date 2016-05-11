package views

import scalatags.Text.all._
import scalatags.Text.tags2.title

class GalleryView {
  val rows = 1 to 5
  val columns = 1 to 3
  val page = {
      html( lang:="en",
        head(
          title("Vladimirs example"),
          meta( charset:="utf-8"),
          meta( name:="viewport", content:="width=device-width, initial-scale=1"),
          link( rel:="stylesheet", href:="/components/bootstrap/css/bootstrap.min.css"),
          link( rel:="stylesheet", href:="/css/gallery.css"),
          script( src:="/components/jquery/jquery-2.2.3.min.js"),
          script( src:="/components/bootstrap/js/bootstrap.min.js"),

          script("""
            $(document).ready(function() {
              $('img.inGallery').click(function() {
                if($(this).hasClass('selectedImg')) {
                  $(this).removeClass('selectedImg');
                }
                else {
                  $(this).addClass('selectedImg');
                }
              });
            });"""
          )
        ),
        body(
          div( cls:="container",
            for (row <- rows ) yield div( cls:="row",
              for (column <- columns) yield
                div( cls:="col-sm-4",
                  img(src:= "public/icon.jpg", style:="margin:50px 50px", cls:="inGallery")
                )
            )
          )
        )
      )
  }

}
