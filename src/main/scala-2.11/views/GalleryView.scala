package views

import scalatags.Text.all._
import scalatags.Text.tags2.title

class GalleryView {
  val imageIds = List(121, 2332, 1222, 7126, 1823, 9128, 1928, 923744,55, 66, 77)

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
              var clickedarray = new Array();
              $('img.inGallery').click(function() {
                var id = $(this).attr('id');
                if($(this).hasClass('selectedImg')) {
                  var index = clickedarray.indexOf(id);
                  clickedarray.splice(index, 1);
                  $(this).removeClass('selectedImg');
                  console.log(clickedarray);
                }
                else {
                  clickedarray.push(id);
                  $(this).addClass('selectedImg');
                  console.log(clickedarray);
                }
              });
            });"""
          )
        ),
        body(
          div( cls:="container",
            div( cls:="row",
              for (imgId <- imageIds) yield
                a(cls:="thumbnail", href:="#",
                  div( cls:="col-lg-3 col-md-4 col-xs-6 thumb",
                  img(src:= "public/icon.jpg", id:=imgId, cls:="inGallery col-lg-3 col-md-4 col-xs-6 thumb")
                  )
                )
            )
          )
        )
      )
  }

}
