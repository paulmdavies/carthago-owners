package com.carthagoowners.pages

import java.io.File
import scalatags._
import com.carthagoowners._
import java.io._

abstract class Page( val name : String ) extends CustomTags
{
	def customContents( ) : Seq[HtmlTag]
    
    def generate( ) : scala.xml.Node =
    {
        html(
	        headContents,
	        body(
    	        bodyHeader,
    	        bodyContents( customContents:_* ),
	        	bodyFooter
	    	)
	    ).toXML
    }
    
	def toFile( parent : File = new File( "." ) ) : Unit =
	{
	    val path = parent + "/%s.html".format( name )
	    val node = generate()
	    
	    val formattedXML = new scala.xml.PrettyPrinter( 200, 4 ).format( node )
	    val writer = new BufferedWriter( new FileWriter( path ) )
	    writer.write( formattedXML )
	    writer.close
	}
    
    def headContents() : HtmlTag =
    {
        head(
	        meta.attr( "content" -> "Carthago Owners: The website of the UK's Carthago owners" ).name( "description" ),
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
    		),
    		div.id( "header_links" ).attr( "class" -> "inner" )(
    		    a.href( "index.html" ).name( "Homepage" )( "Home" ),
    		    a.href( "contact.html" ).name( "Contact" )( "Contact Us" )
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