package com.carthagoowners.pages

import scalatags._
import com.carthagoowners._
import scala.xml.Unparsed

class December2008GatheringPage extends Page( "gatheringDecember2008" )
{
	def customContents() : Seq[HtmlTag] =
	{
	    Seq( 
	        h1( "Christmas Dinner Party 2008" ),
	        h2( "Sunday 14th December 2008" ),
	        h3( "Location" ),
	        p( "Tom Browns Brasserie" ),
	        h3( "Summary"),
	        p( "Twenty members gathered at Tom Browns Brasserie for a Christmas Dinner Party." ),
	        h3 ("Report"),
	        h6( "by George Pennells" ),
	        img.attr( "src" -> "images/gatheringDecember2008/Christmas 1.png", "alt" -> "Christmas 1"),
	        p("l-r:  Wendy Ingrey,  Michael & Rosemary Eastbrook,  Dave & Chris Davies").attr("class"->"imagelabel"),
	        img.attr( "src" -> "images/gatheringDecember2008/Christmas 2.jpg", "alt" -> "Christmas 2"),
	        p("l-r:  Colin Munro, Peter Lea, George Pennells, John Proctor,  Eddie Prince").attr("class"->"imagelabel"),
	        img.attr( "src" -> "images/gatheringDecember2008/Christmas 3.jpg", "alt" -> "Christmas 3"),
	        p("l-r:  Sue Prince, Christine Proctor, Pauline Lea,  Mary Munro").attr("class"->"imagelabel"),
	        img.attr( "src" -> "images/gatheringDecember2008/Christmas 4.jpg", "alt" -> "Christmas 4"),
	        p("l-r:  Sue Stocker, Peter Clark, Brian Stocker, Peggy Clark, Brian Ingrey").attr("class"->"imagelabel")
        )
	}
}