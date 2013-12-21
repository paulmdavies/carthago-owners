package com.carthagoowners

import scala.xml.Node
import scalatags._

class IndexPage extends Page( "index" )
{
	def body() : HtmlTag =
	{
	    bodyContents(
	        h1(
				a.name( "about-us" ).cls( "anchor" ).href( "#about-us" )(
			        span.cls( "octicon octicon-link" )
		        )
			)( "About Us" ),
			p( "About the members club or whatever" )
		)
	}
}