/**
 * Copyright
 */
package com.oopsday.adrop.domain.memory

import org.specs2.mutable._

class ExtractKnowledgeFromHtmlSpec extends Specification{ override def is=

  "Extract knowledge from html" .title

  "In order to keep the useful knowledge from websites" ^p^
  "As a user I want to extract knowledge from the html pages"  ^p

  "Keep the title of html page" >>{
     html=
       """
         <p>THis is a paragraph
         </p>
       """
    extract(html) must_==
      """
       THis is a paragraph
      """
  }


  var html:String=null;

}




