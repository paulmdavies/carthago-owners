package com.carthagoowners.pages

import scalatags._
import com.carthagoowners._
import scala.xml.Unparsed

class May2008GatheringPage extends Page( "gatheringMay2008" )
{
	def customContents() : Seq[HtmlTag] =
	{
	    Seq( 
	        h1( "Inaugural UK Gathering - 2008" ),
	        h2( "Friday 9th May - Sunday 11th May 2008" ),
	        h3( "Location" ),
	        p( "Derbyshire Peak District" ),
	        h3( "Summary"),
	        p( "What a fantastic weekend." ),
	        p( "29 Carthagos gathered for our first gathering." ),
	        h3 ("Report"),
	        h6( "by George Pennells" ),
	        p( "Wow!  What a fantastic weekend. The weather was bright, hot and sunny, the location was superb and the Carthago Owner members were a smashing bunch of people. " ),
	        p( "Twenty eight Carthagos and one Burstner (soon to be a Chic) gathered at Rivendale, in the beautiful Derbyshire Peak District for our first get together since the formation of the group." ),
	        p( "As it was the first time that we had gathered together many of us had reservations about how the weekend was going to turn out but everyone had a great time and we all made some very good new friends." ),
	        p("Group Photo").attr("class"->"imagelabel"),
	        img.attr( "src" -> "images/gatheringMay2008/Group Photo.jpg", "alt" -> "Group Photo" ),
	        p( "Most members arrived on Friday and we met up in the bar in the evening to chat to fellow owners and to get to know each other." ),
	        p( "On Saturday a walk was organised, for the fitter members, into the beautiful village of Tissington. For those not so fit there was an option to cycle along the Tissington Trail and if that was still too strenuous there were a few members who had towed their cars behind their Carthagos for just such an occasion. The village tea shop was well patronised and we saw a few early cream teas being served!" ),
	        img.attr( "src" -> "images/gatheringMay2008/Walk to Tissington.jpg", "alt" -> "Walk to Tissington", "width" ->"380" ),
	        img.attr( "src" -> "images/gatheringMay2008/Happy Hikers.jpg", "alt" -> "Happy Hikers", "width" ->"380" ),
	        p( "Saturday afternoon was the first formal meeting and the Prancing Pony bar was filled to capacity. It was agreed by a large majority that we should be a 'Common Interest Group' and not a 'Club'.  Several members offered to provide material for future newsletters and there was some constructive discussion as to how our website could be enhanced." ),
	        p( "Michael Sterk from Carthago gave a brief talk about Carthago history and also their plans for the future.  Michael kindly donated coffee mugs to all members which were decorated with the Carthago Owners UK logo."),
	        p( "Ian Brown from Lowdhams talked about their future plans and the importance of Carthago in their product range. There was an enthusiastic discussion about Lowdhams plans to improve their after sales service and Ian responded to a range of questions from members. Lowdhams kindly donated an Antony Worrall Thompson saucepan set for a prize draw and one lucky member was delighted with the prize!"),
	        p( "The meeting was followed by a Pub style quiz in the open air while we shared cakes and tea. Again, Lowdhams had kindly donated bottles of wine for the winners and runners up."),
	        img.attr( "src" -> "images/gatheringMay2008/Quiz Team Them & Us.jpg", "alt" -> "Quiz Team Them & Us", "width" ->"380" ),
	        img.attr( "src" -> "images/gatheringMay2008/Quiz Team Peanuts.jpg", "alt" -> "Quiz Team Peanuts", "width" ->"380" ),
	        img.attr( "src" -> "images/gatheringMay2008/Quiz Team John & Co.jpg", "alt" -> "Quiz Team John & Co", "width" ->"380" ),
	        img.attr( "src" -> "images/gatheringMay2008/Quiz Team Fox Hat.jpg", "alt" -> "Quiz Team Fox Hat", "width" ->"380" ),
	        p( "By Sunday morning everyone had made many new friends and there was plenty of chatting about a variety of motorhoming subjects going on all over the campsite. Many hints and tips were exchanged and we hope to publish some of these on the web site very soon."),
	        p( "After gathering for a farewell coffee members started making their way to their next destinations.  All were agreed that the 'Inaugural Gathering' had been a great success."),
	        img.attr( "src" -> "images/gatheringMay2008/Base Camp.jpg", "alt" -> "Base Camp", "width" ->"380" ),
	        img.attr( "src" -> "images/gatheringMay2008/Sunday Morning Coffee.jpg", "alt" -> "Sunday Morning Coffee", "width" ->"380" ),
	        img.attr( "src" -> "images/gatheringMay2008/Peter & Pauline.jpg", "alt" -> "Peter & Pauline and their endless supplies of drinks", "width" ->"380" ),
	        img.attr( "src" -> "images/gatheringMay2008/Youngest Member.jpg", "alt" -> "Youngest Member enjoys an ice-cream at Tissington", "width" ->"380" ),
	        img.attr( "src" -> "images/gatheringMay2008/Fire Chief & Crew.jpg", "alt" -> "Fire Chief & Crew", "width" ->"380" ),
	        img.attr( "src" -> "images/gatheringMay2008/Tow Car.jpg", "alt" -> "Is that a tow car or a towed car", "width" ->"380" )

        )
	}
}