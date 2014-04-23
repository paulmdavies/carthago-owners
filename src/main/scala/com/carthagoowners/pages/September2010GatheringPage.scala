package com.carthagoowners.pages

import scalatags._
import com.carthagoowners._

class September2010GatheringPage extends Page( "gatheringSeptember2013" )
{
	def customContents() : Seq[HtmlTag] =
	{
	    Seq( 
	        h1( "3rd European Gathering - 2010" ),
	        h2( "Thursday 16th September - Sunday 19th September 2013" ),
	        h3( "Location" ),
	        p( "Camping L'Isle Verte in Montsereau, Pays de la Loire" ),
	        h3( "Summary"),
	        p( "Our September Gathering in 2010 was held at Montsereau near Saumur." ),
	        p( "15 Carthagos gathered at the campsite on the banks of the Loire." ),
	        h3 ("Report"),
	        h6( "by George Pennells" ),
	        p( "Fifteen Carthagos Gathered in Montsoreau on La Loire in France and yet again we had beautiful weather for the weekend." ),
	        p( scala.xml.Unparsed ("Thanks to Eddie and Sue Prince who organised the event and to Cl&ecaute;ment and Sylvia of L'Isle Verte campsite everything ran to plan and everyone said what a wonderful Gathering it had been and how much they had enjoyed it")),p( "" ),
	        p(""),
	        p(""),
	        p(""),
	        p(""),
	        p(""),
	        img.attr( "src" -> "images/gatheringSeptember2013/Montsereau.jpg", "alt" -> "Chateau at Montsereau" )
	    )
	}
}