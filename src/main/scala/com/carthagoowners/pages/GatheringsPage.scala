package com.carthagoowners.pages

import scalatags._
import com.carthagoowners._

class GatheringsPage extends Page( "gatherings" )
{
	def customContents() : Seq[HtmlTag] =
	{
	    Seq( 
	        h1( "Gatherings" ),
	        table(
	            tr( 
	        		td( "2014" ),
	        		td( "May" ),
	        		td( "September" ),
	        		td( "October" )
	        	),
	        	tr(
	        		td( "2013" ),
	        		td( a.href( "gatheringMay2013.html" ).name( "May2013" )( "May" ) ),
	        		td( a.href( "gatheringSeptember2013.html" ).name( "September2013" )( "September" ) ),
	        		td( a.href( "gatheringCarthagoCity2013.html" ).name( "CarthagoCity2013" )( "Carthago City" ) ),
	        		td( a.href( "gatheringOctober2013.html" ).name( "October2013" )( "October" ) )
	        	)
	        )
	    )
	}
}