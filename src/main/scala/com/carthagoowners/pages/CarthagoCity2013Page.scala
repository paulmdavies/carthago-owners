package com.carthagoowners.pages

import scalatags._
import com.carthagoowners._
import scala.xml.Unparsed

class CarthagoCity2013Page extends Page( "gatheringCarthagoCity2013" )
{
	def customContents() : Seq[HtmlTag] =
	{
	    Seq( 
	        h1( "Factory Tour 2013" ),
	        h2( "Monday 28th September - Wednesday 30th September 2013" ),
	        h3( "Location" ),
	        p( "Carthago City, Aulendorf, Germany" ),
	        h3( "Summary"),
	        p( "9 Carthagos gathered at Carthago City" ),
	        h3 ("Report"),
	        h6( scala.xml.Unparsed( "by George & Desn&eacute;e Pennells" ) ), 
	        p( "After leaving the Carthago Owners UK Gathering in Sarzeau we continued to stay in France for a week in the Dordogne.  The weather was hot and sunny - lovely!" ),
	        p( "At the end of September we met up again with some of the UK owners for a Carthago hosted day at the new Carthago City in Aulendorf, southern Germany." ),
	        p( "We all arrived the night before and stopped over on the Carthago Stellplatz. The next morning we found that fresh rolls had been delivered to our doors, courtesy of Carthago." ),
	        p( "Carthago City is impressive. There is a large administration block, the manufacturing area where the Chic E and S lines are produced on one production line (see below) and the Highliners and Liners are produced on a parallel production line under the same roof." ),
	        p( "" ),
	        img.attr( "src" -> "images/gatheringSeptember2013/Everyone1.jpg", "alt" -> "Everyone" )
	    )
	}
}