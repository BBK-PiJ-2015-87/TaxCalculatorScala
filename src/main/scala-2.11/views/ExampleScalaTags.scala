package views

import scalatags.Text.all._

class ExampleScalaTags {

  val htmlFrag = {
    div(
      h1("Header 1"),
      h2("Header 2"),
      h3("Header 3"),
      h4("Header 4"),
      h5("Header 5"),
      h6("Header 6"),
      hr,
      p(
        "This is a paragraph with a whole bunch of ",
        "text inside. You can have lots and lots of ",
        "text"
      ),
      b("bold"), " ",
      i("italic"), " ",
      s("strikethrough"), " ",
      u("underlined"), " ",
      em("emphasis"), " ",
      strong("strong"), " ",
      sub("sub"), " ",
      sup("sup"), " ",
      code("code"), " ",
      a("a-link"), " ",
      small("small"), " ",
      cite("cite"), " ",
      ins("ins"), " ",
      del("del"), " ",
      hr,
      ol(
        li("Ordered List Item 1"),
        li("Ordered List Item 2"),
        li("Ordered List Item 3")
      ),
      ul(
        li("Unordered List Item 1"),
        li("Unordered List Item 2"),
        li("Unordered List Item 3")
      ),
      dl(
        dt("Definition List Term 1"),
        dd("Definition List Item 1"),
        dt("Definition List Term 2"),
        dd("Definition List Item 2")
      ),
      hr,
      pre(
        """
          |Preserved formatting area with all the whitespace
          |kept around and probably some kind of monospace font
        """.stripMargin
      ),
      blockquote(
        """
          |Block quote with a bunch of text inside
          |which really rox
        """.stripMargin
      ),
      hr,
      table(
        caption("This is a table caption"),
        thead(
          tr(
            th("Header Content 1"),
            th("Header Content 2")
          )
        ),
        tbody(
          tr(
            td("Body Content 1"),
            td("Body Content 2")
          ),
          tr(
            td("Body Content A"),
            td("Body Content B")
          )
        ),
        tfoot(
          tr(
            td("Foot Content 1"),
            td("Foot Content 2")
          )
        )
      ),
      hr,
      label("input"), input,
      br,
      label("select"),
      select(
        option("lol"),
        option("wtf")
      ),
      br,
      label("textarea"),
      textarea
    )
  }
}
