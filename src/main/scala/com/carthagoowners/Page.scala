package com.carthagoowners

import java.io.File

abstract class Page( val name : String )
{
    def generate( ) : scala.xml.Node
    
	def toFile( parent : File = new File( "." ) ) : Unit =
	{
	    val path = parent + "/%s.html".format( name )
	    val node = generate()
	    scala.xml.XML.save( path, node )
	}
}