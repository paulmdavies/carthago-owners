package com.carthagoowners

import java.io.File
import scalatags._

abstract class Page( val name : String )
{
    def body() : HtmlTag
    
    def generate( ) : scala.xml.Node =
    {
        html(
	        headContents,
	    	bodyContents(
    	        // header
    	        bodyHeader,
	        	// main body
    	        body,
	        	// footer
	        	bodyFooter
	    	)
	    ).toXML
    }
    
	def toFile( parent : File = new File( "." ) ) : Unit =
	{
	    val path = parent + "/%s.html".format( name )
	    val node = generate()
	    scala.xml.XML.save( path, node )
	}
    
    def headContents() : HtmlTag =
    {
        head(
	        meta.name( "description" ).attr( "content" -> "Carthago Owners: The website of the UK's Carthago owners" ),
			link.attr(
				"rel" -> "stylesheet",
				"type" -> "text/css",
				"media" -> "screen",
				"href" -> "stylesheets.css"
			),
			title( "Carthago Owners" )
		)
    }
    
    def bodyHeader() : HtmlTag =
    {
        div.id( "header_wrap" ).attr( "class" -> "outer" )(
            header.attr( "class" -> "inner" )(
            	h1.id( "project_title" )( "Carthago Owners" ),
            	h2.id( "project_tagline" )( "The website of the UK's Carthago owners" )
    		)
    	)
    }
    
    def bodyFooter() : HtmlTag =
    {
        div.id( "footer_wrap" ).attr( "class" -> "outer" )(
    		footer.attr( "class" -> "inner" )(
    			p.attr( "class" -> "copyright" )( "Carthago Owners maintained by Paul Davies and Gill Davies" )
    		)
    	)
    }
    
    def bodyContents( tags : HtmlTag* ) : HtmlTag =
    {
        div.id( "main_content_wrap" ).attr( "class" -> "outer" )(
    		section.id( "main_content" ).attr( "class" -> "inner" )(
    			tags
    		)
    	)
    }
}