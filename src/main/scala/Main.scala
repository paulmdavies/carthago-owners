import com.carthagoowners.pages._

object Main extends App
{
	override def main( args : Array[String] ) =
	{
	    println( "Generating index page" )
	    new IndexPage().toFile()
	    println( "Generating contact us page" )
	    new ContactPage().toFile()
	    println( "Generating gatherings page" )
	    new GatheringsPage().toFile()	    
	    println( "Generating May 2013 page" )
	    new May2013GatheringPage().toFile()
	}
}