package views

import scalatags.Text.all._
import scalatags.Text.tags2.title

class GalleryView {
  val imageIds = 1 to 12

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
            });""",

            """
            $(document).ready(function() {
              $('button.printButton').click(function() {
                window.print();
              });
            });""",

            """
            $(document).ready(function() {
              $('button.saveButton').click(function() {
                var url = '/print';
                window.location.href = url;
                return false;
              });
            });"""


          )
        ),
        body(
          div(
            button(tpe:="button", cls:="btn btn-default printButton","Print")
          ),
          div(
            button(tpe:="button", cls:="btn btn-default saveButton","Save")
          ),
          div( cls:="container",
            div( cls:="row",
              for (imgId <- imageIds)
                yield
                  div( cls:="col-lg-4 col-md-6 col-xs-12 thumb",
                    img(src:= "public/circle"+imgId+".png", id:=imgId, cls:="inGallery img-responsive img-circle thumb")
                  )
            )
          )
        )
      )
  }

}
