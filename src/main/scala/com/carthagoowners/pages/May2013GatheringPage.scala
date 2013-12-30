package com.carthagoowners.pages

import scalatags._
import com.carthagoowners._

class May2013GatheringPage extends Page( "gatheringMay2013" )
{
	def customContents() : Seq[HtmlTag] =
	{
	    Seq( 
	        h1( "6th UK Gathering - 2013" ),
	        h2( "Thursday 16th May - Sunday 19th May 2013" ),
	        h3( "Location" ),
	        p( "Summer Ponds, Nr Horsham, Sussex" ),
	        h3( "Summary"),
	        p( "Our Spring Gathering in 2013 was held in the beautiful county of Sussex." ),
	        p( "27 Carthagos gathered at this beautiful campsite and enjoyed an unusual sunny and warm spell in what was rather a wet May." ),
	        h3 ("Report"),
	        h6( "by Roger and Diane Hersee" ),
	        p( "The weather returned to cold and wet, again, with forecasts of more to come. It was mid-May and time to get ready for the spring gathering at Sumners Ponds. This all reminded us of how it had also been just before the Ambleside meeting, last year. But the vagaries of the weather were not going to dissuade us from going, particularly considering that we'd already paid our deposit. We needn't have worried as it turned out better for us for the full duration, just as it had done last year." ),
	        img.attr( "src" -> "images/gatheringMay2013/1.jpg", "alt" -> "Dogs" )
	    )
	}
}