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
	        		td( "May" ),
	        		td( "September" ),
	        		td( "October" ),
	        		td( "Hypothetical December" )
	        	)
	        )
	    )
	}
}