package com.carthagoowners.pages

import scalatags._
import com.carthagoowners._
import scala.xml.Unparsed

class May2012GatheringPage extends Page( "gatheringMay2012" ){

 	def customContents() : Seq[HtmlTag] =
	{
	    Seq( 
	        h1( "5th UK Gathering - 2012" ),
	        h2( "Thursday 17th May - Sunday 20th May 2012" ),
	        h3( "Location" ),
	        p( "Ambleside" ),
	        img.attr( "src" -> "images/gatheringMay2012/Lake District.jpg", "alt" -> "Lake District", "width" ->"480"  ),        
	        h3( "Summary"),
	        p( "A lovely weekend with a Gathering of 29 Carthagos." ),
	        h3 ("Report"),
	        h6( "by George Pennells" ),
	        p("First of all, a very big 'thank you' to Ruth and Geoff Bass who gave us a huge amount of support to organise this event."),
	        p("58 people arrived to a rather wet field at the Ambleside Rugby Club. All the front wheel drive Carthagos stayed on the car park hard standing but the rear wheel drives had to take to the grass. A few became stuck in the mud but by the end of the weekend everything had dried out enough for those to escape without being towed out."),
	        p("We were not as lucky with the weather this year but conditions improved day by day. As it turned out we were able to participate in all the planned activities - it was just a shame that it was not sunny everyday."),
	        p("The Rugby club bar was open on Thursday evening and Jack (the Club Chairman) and acting barman made us most welcome and was the perfect host."),
	        p("On Friday morning 38 of us took the steamer trip on Lake Windermere. Some of those went down to Lakeside and visited the Motor Museum whilst others explored Bowness and Windermere."),	        
	        img.attr( "src" -> "images/gatheringMay2012/Carthagos 1.jpg", "alt" -> "Carthagos 1 Photo" ),
	        img.attr( "src" -> "images/gatheringMay2012/Boat 1.jpg", "alt" -> "Boat 1 Photo", "width" ->"480"  ),
	        img.attr( "src" -> "images/gatheringMay2012/Boat 2.jpg", "alt" -> "Boat 2 Photo", "width" ->"480"  ),
	        img.attr( "src" -> "images/gatheringMay2012/Boat 3.jpg", "alt" -> "Boat 3 Photo", "width" ->"480"  ),
	        img.attr( "src" -> "images/gatheringMay2012/Boat 4.jpg", "alt" -> "Boat 4 Photo", "width" ->"480"  ),
	        p("Windermere steamer passengers. (above) John Davies, Martyn and Dee Curley and Ruby (above right)  Ken and Georgina Hudson, Mike and Cath Rowland, John Pearson-Gee,  John and Wilma Kane (right) Derek Cornish and hooded ladies; Jane Cornish, Desnee and Yvonne Bassett"),
	        p("Friday evening we enjoyed a superb meal in the clubhouse which was provided by Karen Rhodes Catering, a local company. The caterers were exceptionally good, the food was really tasty and the young waitresses did a super job. A good time was had by all and it was lovely to catch up with old friends and to meet new ones."),
	        p("Saturday morning, the more energetic members headed off for a walk around and over Loughrigg Fell lead by Geoff and Ruth Bass.  We found a few caves to explore before making the climb up to the summit. (Photos below by Roger Hersee)"),
	        img.attr( "src" -> "images/gatheringMay2012/Walk 1.jpg", "alt" -> "Walk 1 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2012/Walk 2.jpg", "alt" -> "Walk 2 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2012/Walk 3.jpg", "alt" -> "Walk 3 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2012/Walk 4.jpg", "alt" -> "Walk 4 Photo", "width" ->"480" ),
	        p("Saturday evening we enjoyed a splendid Lamb Roast provided by Fred Garside, the local butcher. Salads and puddings were sourced from local shops and served by our lovely ladies."),
	        p("As usual, Saturday evening could not pass without the Quiz night. Some new puzzles and teasers challenged the grey matter. The 'regulars' were soundly thrashed by the 'Newbies' team. Ian Brown of Lowdhams kindly donated the prizes which comprised a bottle of wine for each member of the winning team and a bottle of wine per couple for the runners up. Ian apologised that he was not able to attend this year but asked that his best wishes were passed on to all."),
	        p("During the evening Jack (the barman) invited us to take part in a 'guess the value' of a jar of old currency coins. The proceeds went to support the Ambleside junior rugby teams. The winner and runner up both kindly donated their winnings to be auctioned and overall in excess of 55 was raised - thank you everyone!"),
	        img.attr( "src" -> "images/gatheringMay2012/Hog 1.jpg", "alt" -> "Hog 1 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2012/Hog 2.jpg", "alt" -> "Hog 2 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2012/Hog 3.jpg", "alt" -> "Hog 3 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2012/Hog 4.jpg", "alt" -> "Hog 4 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2012/Hog 5.jpg", "alt" -> "Hog 5 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2012/Hog 6.jpg", "alt" -> "Hog 6 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2012/Hog 7.jpg", "alt" -> "Hog 7 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2012/Hog 8.jpg", "alt" -> "Hog 8 Photo", "width" ->"480" ),
	        p("Sunday morning cakes were provided and a Question Time session was held where a number of issues were raised and discussed. Thank you to those who raised the questions and to those who provided some answers."),
	        p("Next year's location was announced and George and Desnee explained that, as it is a very popular site, we needed to reserve pitches as soon as possible.  Several members placed their deposit there and then and so we already have many members determined to join us at the next UK Gathering.  Check this website for the latest update for May 2013."),
	        p("Sadly, it was time to say farewell to friends old and new as people headed off for their next destination.  We were pleased to hear from several members, who had joined us for the first time, that they had been somewhat apprehensive but as it turned out, they had thoroughly enjoyed themselves and hope to join us again."),
	        p("Thank you to everyone who came along to Ambleside and for supporting our Gatherings.")

        )
	}
}