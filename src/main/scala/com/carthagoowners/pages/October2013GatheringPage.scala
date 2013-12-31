package com.carthagoowners.pages

import scalatags._
import com.carthagoowners._

class October2013GatheringPage extends Page( "gatheringOctober2013" )
{
	def customContents() : Seq[HtmlTag] =
	{
	    Seq( 
	        h1( "Carthago Kreis - Ellwangen - 2013" ),
	        h2( "Wednesday 2nd October - Sunday 6th October 2013" ),
	        h3( "Location" ),
	        p( "Ellwangen" ),
	        h3( "Summary"),
	        p( "Carthago Kreis (the German owners club) kindly extended an invitation to all Carthago Owners UK members to join them at their Meeting at Ellwangen, Germany." ),	        
	        p( "9 UK vans joined this meeting and had a lovely time " ),
	        h3 ("Report"),
	        h6( "by Gill Davies" ),
	        p( "We arrived at a huge car park at the edge of town to be shown with the usual German efficiency into our own British area next to Maureen & Hans-Dieter who were our translators for the weekend. After much confusion with the electricity as not many of us had splitters (mental note to buy one for next time) we were hooked up and settled in. The parking was very convenient as it was only 5 minutes walk from town and the town hall where all the activities were to take place." ),
	        img.attr( "src" -> "images/gatheringOctober2013/British Carthagos.jpg", "alt" -> "British Carthagos" ),	        
	        img.attr( "src" -> "images/gatheringOctober2013/Carthagos & Church.jpg", "alt" -> "Carthagos & Church" )
	    )
	}
}