package com.carthagoowners

import scala.xml.Node
import scalatags._

class IndexPage extends Page( "index" )
{
	def generate() : scala.xml.Node =
	{
	    html(
	        head(
	        	meta.name( "description" ).attr( "content" -> "Carthago Owners: The website of the UK's Carthago owners" ),
	        	link.attr(
	        		"rel" -> "stylesheet",
	        		"type" -> "text/css",
	        		"media" -> "screen",
	        		"href" -> "stylesheets.css"
	        	),
	        	title( "Carthago Owners" )
	        ),
	    	body(
    	        // header
    	        div.id( "header_wrap" ).cls( "outer" )
    	        (
	                header.cls( "inner" )(
	                	h1.id( "project_title" )( "Carthago Owners" ),
	                	h2.id( "project_tagline" )( "The website of the UK's Carthago owners" )
            		)
	        	),
	        	// main body
	        	div.id( "main_content_wrap" ).cls( "outer" )
	        	(
	        		section.id( "main_content" ).cls( "inner" )
	        		(
	        			h1(
	        				a.name( "about-us" ).cls( "anchor" ).href( "#about-us" ),
	        				span.cls( "octicon octicon-link" )
	        			)( "About Us" ),
	        			p( "About the members club or whatever" )
	        		)
	        	),
	        	// footer
	        	div.id( "footer_wrap" ).cls( "outer" )
	        	(
	        		footer.cls( "inner" )
	        		(
	        			p.cls( "copyright" )( "Carthago Owners maintained by Paul Davies and Gill Davies" )
	        		)
	        	)
	    	)
	    ).toXML
	}
}