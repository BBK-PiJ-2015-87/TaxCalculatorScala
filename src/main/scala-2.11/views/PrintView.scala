package views

import scalatags.Text.all._
import scalatags.Text.tags2.title

/**
  * Created by Workstation on 11/05/2016.
  */
class PrintView {

  val passedIDs = 1 to 5

  val page = {
    html( lang:="en",
      head(
        title("Print Example"),
        meta( charset:="utf-8"),
        meta( name:="viewport", content:="width=device-width, initial-scale=1"),
        link( rel:="stylesheet", href:="/components/bootstrap/css/bootstrap.min.css"),
        link( rel:="stylesheet", href:="/css/gallery.css"),
        script( src:="/components/jquery/jquery-2.2.3.min.js"),
        script( src:="/components/bootstrap/js/bootstrap.min.js"),

        script(
          """
            $(document).ready(function() {
              $('button.printButton').click(function() {
                window.print();
              });
            });"""

        )
      ),
      body(
        div(
          button(tpe:="button", cls:="btn btn-default printButton","Print")
        ),

        div( cls:="container",
          div( cls:="row Section1 fullpage",
            for (imgId <- passedIDs)
              yield
                div( cls:="col-lg-12 col-md-12 col-xs-12", img( cls:="fullsize", src:="large/icon.jpg", alt:="" ))
          )
        )
      )
    )
  }


}
