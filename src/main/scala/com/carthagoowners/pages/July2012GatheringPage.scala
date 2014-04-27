package com.carthagoowners.pages

import scalatags._
import com.carthagoowners._
import scala.xml.Unparsed

class July2012GatheringPage extends Page( "gatheringJuly2012" ){

 	def customContents() : Seq[HtmlTag] =
	{
	    Seq( 
	        h1( "Carthago Kreis - Kiel - 2012" ),
	        h2( "Wednesday 11th July - Sunday 15th July 2012" ),
	        h3( "Location" ),
	        p( "Kiel" ),
	        img.attr( "src" -> "images/gatheringJuly2012/Kiel 1.jpg", "alt" -> "Kiel 1 Photo", "height" -> "400" ),
	        h3( "Summary"),
	        p( "A warm German welcome to 7 British Carthagos." ),
	        h3 ("Report"),
	        h6( "by Gill Davies" ),
	        p("Kiel is the capital city of the German state of Schleswig-Holstein. It is on the Baltic Sea and at the end of the Kiel Canal, the world's busiest canal. During the Second World War, Kiel was severely bombed, because of its submarine-producing shipyard. The bombing destroyed almost all historic buildings in Kiel; even the older looking buildings were built after WW2. The Olympic centre in Schilksee was built as the yachting centre for the Summer Olympics in 1972."),
	        p("Over one hundred Carthagos were parked on the L shaped 'green' to the right of the buildings in the picture below."),
	        img.attr( "src" -> "images/gatheringJuly2012/Kiel 2.png", "alt" -> "Kiel 2 Photo", "height" -> "350", "width" ->"600" ),
	        img.attr( "src" -> "images/gatheringJuly2012/Kiel 3.jpg", "alt" -> "Kiel 3 Photo", "height" -> "350" ),
	        p("The Welcome Reception was held in the 'Vaasahall'. The food was the local speciality of fish in all kinds of variations with rolls, potato or noodle salad. We all said we had never eaten so much COLD fish done in so many different ways! Afterwards we were entertained by a shanty choir."),
	        img.attr( "src" -> "images/gatheringJuly2012/Shanty Choir.png", "alt" -> "Shanty Choir Photo", "height" -> "400", "width" ->"700" ),
	        img.attr( "src" -> "images/gatheringJuly2012/Fish 1.png", "alt" -> "Fish 1 Photo", "height" -> "400", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringJuly2012/Fish 2.png", "alt" -> "Fish 2 Photo", "height" -> "400", "width" ->"480" ),
	        p("On Thursday we went on a Harbour tour boat trip starting from the centre of Kiel and going out as far as Laboe and returning past the entrance to the Kiel canal. On the east-side of the fjord Laboe has the only surviving Type VII-C U-boat from World War 2 and the Navy Memorial high tower."),
	        img.attr( "src" -> "images/gatheringJuly2012/Kiel Canal.png", "alt" -> "Kiel Canal Photo", "height" -> "350", "width" ->"600" ),
	        img.attr( "src" -> "images/gatheringJuly2012/Laboe 1.png", "alt" -> "Laboe 1 Photo", "height" -> "400", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringJuly2012/Laboe 2.png", "alt" -> "Laboe 2 Photo", "height" -> "400", "width" ->"480" ),
	        p("Lunch at the Kieler Brauerie was fantastic  -  super food and marvellous beer which was brewed in the cellar."),	        
	        img.attr( "src" -> "images/gatheringJuly2012/Kiel Bier Keller 1.png", "alt" -> "Kiel Bier Keller 1 Photo", "height" -> "400", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringJuly2012/Kiel Bier Keller 2.png", "alt" -> "Kiel Bier Keller 2 Photo", "height" -> "400", "width" ->"480" ),
	        p("On Friday we went for a tour around the Color Line ferry (more like a cruise liner) which crosses overnight to Norway, it gave us some views of Kiel. In the afternoon Carthago Kreis were holding their AGM so we Brits decided we had to revisit the Kieler Braurei to sample some more of their beer!"),
	        img.attr( "src" -> "images/gatheringJuly2012/Kiel 4.png", "alt" -> "Kiel 4 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringJuly2012/Kiel 5.png", "alt" -> "Kiel 5 Photo", "width" ->"480" ),
	        p("In the evening we had a lovely Gulasch and were entertained by 'The Carthagos' and joined in the obligatory participation dances."),
	        img.attr( "src" -> "images/gatheringJuly2012/Carthagos.png", "alt" -> "Carthagos Photo", "height" -> "400", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringJuly2012/Dancing.png", "alt" -> "Dancing Photo", "width" ->"480" ),
	        p("Saturday evening there was  a wonderful gala buffet followed by entertainment by a singer and more dancing."),
	        img.attr( "src" -> "images/gatheringJuly2012/Singer.png", "alt" -> "Singer Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringJuly2012/Group 1.png", "alt" -> "Group 1 Photo", "width" ->"480" ),
	        p("We would like to say a big thank you to Marita & Rolf for all their hard work and making us feel so welcome and to Maureen & Dieter for all the translation services."),
	        img.attr( "src" -> "images/gatheringJuly2012/Rolf & Marita.png", "alt" -> "Rolf & Marita Photo", "height" -> "400", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringJuly2012/Maureen & Dieter.png", "alt" -> "Maureen & Dieter Photo", "height" -> "400", "width" ->"480" )
	       
        )
	}
}