/**
 * Copyright
 */
package com.oopsday.adrop.domain.memory

import org.specs2.mutable._

class HtmlMemorySpec extends Specification{ override def is=

  "Html Memory" .title

  "In order to refine the appearence of the knowledge" ^p^
  "As a user I want to purify knowledge from internet in the format of markdown"  ^p

  "purify the <p> element" >>{
     html=
       """
         <p>THis is a paragraph
         </p>
       """
    Markdown(html) must_==
      """
       THis is a paragraph
      """
  }


  var html:String=null;

}


object Markdown{

  def apply(html:String):String={
     val tagStack:List[String] = List.empty
     val markdown:List[Char] = List.empty

    html.map( ch =>{

       ch match {
         case '<' =>
         case '>' =>

       })
     }
  }
}

