package views

import scalatags.Text.all._
import scalatags.Text.tags2.title
/**
  * Created by vladimirsivanovs on 11/05/2016.
  */
class BootstrapView {

  val page = {

      html( lang:="en",
        head(
          title("Vladimirs example"),
          meta( charset:="utf-8"),
          meta( name:="viewport", content:="width=device-width, initial-scale=1"),
          link( rel:="stylesheet", href:="/components/bootstrap/css/bootstrap.min.css"),
          script( src:="/components/jquery/jquery-2.2.3.min.js"),
          script( src:="/components/bootstrap/js/bootstrap.min.js")
        ),
        body(

          div( cls:="container",
            div( cls:="jumbotron",
              h1("My First Bootstrap Page"),
              p("Resize this responsive page to see the effect!")
            ),
            div( cls:="row",
              div( cls:="col-sm-4",
                h3("Column 1"),
                p("Lorem ipsum dolor sit amet, consectetur adipisicing elit..."),
                p("Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...")
              ),
              div( cls:="col-sm-4",
                h3("Column 2"),
                p("Lorem ipsum dolor sit amet, consectetur adipisicing elit..."),
                p("Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...")
              ),
              div( cls:="col-sm-4",
                h3("Column 3"),
                p("Lorem ipsum dolor sit amet, consectetur adipisicing elit..."),
                p("Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...")
              )
            )
          )

        )
      )

  }

}
