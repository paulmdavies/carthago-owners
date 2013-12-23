package com.carthagoowners

import scalatags._

trait CustomTags 
{
	def h1l( name : String, tags : HtmlTag* ) : HtmlTag =
	{
	    val lowerDashName = name.toLowerCase.replace( " ", "-" )
	    h1(
			a.name( lowerDashName ).cls( "anchor" ).href( "#%s".format( lowerDashName ) )(
		        span.cls( "octicon octicon-link" )
	        ))( name )
	}
	
	def h2l( name : String, tags : HtmlTag* ) : HtmlTag =
	{
	    val lowerDashName = name.toLowerCase.replace( " ", "-" )
	    h2(
			a.name( lowerDashName ).cls( "anchor" ).href( "#%s".format( lowerDashName ) )(
		        span.cls( "octicon octicon-link" )
	        ))( name )
	}
}