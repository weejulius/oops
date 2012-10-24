/**
 * Copyright
 */
package com.oopsday.adrop.domain.memory

import org.specs2.mutable._
import org.clapper.markwrap._

class ExtractKnowledgeFromHtmlSpec extends Specification{ override def is=

  "Extract knowledge from html" .title

  "In order to keep the useful knowledge from websites" ^p^
  "As a user I want to extract knowledge from the html pages"  ^p

  "remain the body of html page" >>{
     html=
       """
          <html>
          <head>
            <title> I am title</title>
          </head>
          <body>
          I am body
          </body>
          </html>
       """
    body(html) must_==
      """
       I am body
      """
  }

  class parser{

    val parser = MarkWrap.parserFor(MarkupType.PlainText)
    def obtain(val nodePath:String)
  }
  var html:String=null

}




