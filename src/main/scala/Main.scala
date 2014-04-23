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
	    println( "Generating May 2008 page" )
	    new May2008GatheringPage().toFile()	    
	    println( "Generating October 2008 page" )
	    new October2008GatheringPage().toFile()
	    println( "Generating December 2008 page" )
	    new December2008GatheringPage().toFile()
	    println( "Generating May 2009 page" )
	    new May2009GatheringPage().toFile()	    
	    println( "Generating October 2009 page" )
	    new October2009GatheringPage().toFile()
	    println( "Generating May 2010 page" )
	    new May2010GatheringPage().toFile()	    
	    println( "Generating September 2010 page" )
	    new September2010GatheringPage().toFile()	    
	    println( "Generating May 2011 page" )
	    new May2011GatheringPage().toFile()	    
	    println( "Generating May 2012 page" )
	    new May2012GatheringPage().toFile()	    
	    println( "Generating May 2012 page" )
	    new September2012GatheringPage().toFile()	    
	    println( "Generating May 2013 page" )
	    new May2013GatheringPage().toFile()
	    println( "Generating September 2013 page" )
	    new September2013GatheringPage().toFile()	    
	    println( "Generating Carthago City 2013 page" )
	    new CarthagoCity2013Page().toFile()
	    println( "Generating October 2013 page" )
	    new October2013GatheringPage().toFile()
	}
}