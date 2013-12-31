package com.carthagoowners.pages

import scalatags._
import com.carthagoowners._

class September2013GatheringPage extends Page( "gatheringSeptember2013" )
{
	def customContents() : Seq[HtmlTag] =
	{
	    Seq( 
	        h1( "6th European Gathering - 2013" ),
	        h2( "Wednesday 11th September - Sunday 15th September 2013" ),
	        h3( "Location" ),
	        p( "The Lodge Club, Presqu'il de Rhuys campsite in Sarzeau, southern Brittany" ),
	        h3( "Summary"),
	        p( "Our September Gathering in 2013 was held on the Rhuys peninsula between the Gulf de Morbihan and the Atlantic Ocean." ),
	        p( "18 Carthagos gathered at the campsite surrounded by apple trees." ),
	        h3 ("Report"),
	        h6( "by Roger and Diane Hersee" ),
	        p( "Having made good progress from Calais to Sarzeau we arrived early on the first day of the gathering to find about half of our companions were already present to greet us. This was John & Gill's first attempt at organizing a Carthago gathering and, even though things were not going as they had arranged, they did not appear phased by this and managed to accommodate everything in a very relaxing manner. The best approach for a holiday." ),
	        img.attr( "src" -> "images/gatheringSeptember2013/Everyone1.jpg", "alt" -> "Everyone" )
	    )
	}
}