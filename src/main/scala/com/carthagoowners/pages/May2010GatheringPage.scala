package com.carthagoowners.pages

import scalatags._
import com.carthagoowners._
import scala.xml.Unparsed

class May2010GatheringPage extends Page( "gatheringMay2010" ){

 	def customContents() : Seq[HtmlTag] =
	{
	    Seq( 
	        h1( "3rd UK Gathering - 2010" ),
	        h2( "Friday 8th May - Sunday 10th May 2010" ),
	        h3( "Location" ),
	        p( "Woodland Waters" ),
	        img.attr( "src" -> "images/gatheringMay2009/Woodland Waters Logo.gif", "alt" -> "Woodland Waters Logo", "width" ->"480"  ),        
	        h3( "Summary"),
	        p( "Yet another fabulous weekend with a Gathering of 40 Carthagos and 80+ lovely people." ),
	        h3 ("Report"),
	        h6( "by George Pennells" ),
	        p("Many had arrived on the Thursday and enjoyed a walk around rural Lincolnshire guided by Dave & Chris Davies on the Friday. The walk ended up at The Ermine Way pub in Ancaster just in time for lunch!."),
	        p("It was a great opportunity for a good old chin wag.  Carthago were represented by Michael Sterk and Paul Mock who both brought their families with them and it was good to see them all.  Lowdhams was represented by Ian Brown. Michael, Paul and Ian were kept very busy with members questions. Meanwhile, other members were comparing their modifications, enhancements and travel tales."),
	        img.attr( "src" -> "images/gatheringMay2009/Chat 2.jpg", "alt" -> "Chat 2 Photo", "width" ->"480" )

        )
	}
}