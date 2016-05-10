package views

import scalatags.Text.all._

/**
  * Created by Workstation on 10/05/2016.
  */
class LoopView {
  val list = List(1,2,3,4,5,6,7,8,9,10,11)


  val fragment = {
    html(
      ol(
        for (name <- list) yield li("Ordered List Item ", name)

      )
    )
  }

}
