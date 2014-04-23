package com.carthagoowners.pages

import scalatags._
import com.carthagoowners._
import scala.xml.Unparsed

class May2011GatheringPage extends Page( "gatheringMay2011" ){

 	def customContents() : Seq[HtmlTag] =
	{
	    Seq( 
	        h1( "4th UK Gathering - 2011" ),
	        h2( "Thursday 19th May - Sunday 22nd May 2011" ),
	        h3( "Location" ),
	        p( "The Ranch, Honeybourne" ),
	        img.attr( "src" -> "images/gatheringMay20011/Ranch Logo.jpg", "alt" -> "Ranch Logo", "width" ->"480"  ),        
	        h3( "Summary"),
	        p( "The weekend was yet another great success. Twenty seven Carthagos gathered at this beautiful Cotswold campsite and we were especially delighted to welcome three Carthagos from Germany." ),
	        h3 ("Report"),
	        h6( "by George Pennells" ),
	        p("The Ranch staff looked after us very well and we were pleased to be able to use their bar and restaurant facilities for our Carthago Owners UK get together."),
	        p("Most people arrived on Thursday 19th May and we all assembled in the bar in the evening to meet up with friends old and new. As this is our fourth year of Gatherings we are pleased to see many regular faces coming back to join us and it is a pleasure to see everybody enjoying catching up with each others news.  We were also pleased to welcome some new members and once again, on the last day, their message was 'we did not really think that this was our sort of thing but we have really enjoyed ourselves'."),	        
	        p("Friday was a day of doing your own thing and a small group walked from the Ranch, across the fields, to the Fleece Inn at Bretforden.  The Fleece is an ancient Inn and is now cared for by the National Trust. However, the bar staff were adamant that being National Trust members did not entitle us to free beer!"),
	        p("On Friday evening some members went off, by taxi, to the Pudding Club in nearby Mickleton whilst the major portion of us enjoyed an evening meal in the Ranch restaurant. "),
	        p("Saturday was the coach tour. This was a 'whistle stop tour' around the highlights of the local Cotswolds area.  We first of all travelled to Chipping Camden and spent about an hour walking around this beautiful Cotswold town. Needless to say, the ladies found it an ideal shopping opportunity."),
	        p("Next stop was Hidcote Gardens, a National Trust property.  Here we paused for coffee and cakes and had an opportunity to walk around the gardens.  It was very popular and quite challenging to take a photo without masses of people in the way!  Again a few 'souvenirs' were purchased. "),
	        p("On again to Stow-on-the-Wold. We were dropped off in the centre of this lovely old town and many headed straight for the cafes to top up with lunch. Stow-on-the-Wold is a fascinating town and deserved more time than we were able to allow. In hindsight we would have been better to reduce the number of stops and give a bit more time to explore these lovely places."),
	        p("After Stow-on-the-Wold we travelled through some smaller villages and the town of Burford before stopping again in Bourton-on-the-Water. This is a pretty little town with the picturesque River Windrush flowing through its centre."),
	        p("Time to return back to The Ranch via the town of Broadway."),
	        p("Saturday evening we all made 'piggies' of ourselves with a splendid Hog Roast and this was followed by the, now traditional, Quiz. This year the questions were all about company logos and it certainly challenged the grey matter. You knew you recognised the logo but the names were elusive. The team results were very close but the winners were - Rolf Jungbluth, Peter and Peggy Clark, Ian Brown, Jack and Ann Dobbie.    Runners up were: Clive Walker, Anne Pascoe, Eddie and Sue Prince, Drew Pettican, Courtney and Lynne Hodges, Ludwig Rombey.  The prizes were a bottle of wine for each person in the winning team and a bottle of wine per couple for the runners up."),
	        p("Lowdhams kindly donated the Quiz prizes."),
	        p("Sunday morning we gathered once again in the restaurant for Morning Coffee and to listen to Alex Buchan of Boosters UK who gave us an interesting talk about how to obtain more performance and better fuel consumption from our Carthagos. Several members expressed an interest in taking the matter further and as a result Alex spent the entire day on site following up enquiries."),
	        p("Sadly, it was time to say 'goodbye' until next time. During Sunday and Monday most had departed, either carrying on travelling to new locations, or heading home."),
	        p("Thank you to all that joined us, for your support  -  it is you that makes our Gatherings so enjoyable."),
	        img.attr( "src" -> "images/gatheringMay2011/Carthagos 1.jpg", "alt" -> "Carthagos 1 Photo", "width" ->"480"  ),
	        img.attr( "src" -> "images/gatheringMay2011/Carthagos 2.jpg", "alt" -> "Carthagos 2 Photo", "width" ->"480"  ),
	        img.attr( "src" -> "images/gatheringMay2011/Carthagos 3.jpg", "alt" -> "Carthagos 3 Photo", "width" ->"480"  ),
	        img.attr( "src" -> "images/gatheringMay2011/Carthagos 4.jpg", "alt" -> "Carthagos 4 Photo", "width" ->"480"  ),
	        img.attr( "src" -> "images/gatheringMay2011/Quiz 1.jpg", "alt" -> "Quiz 1 Photo", "width" ->"480"  ),
	        img.attr( "src" -> "images/gatheringMay2011/Quiz 2.jpg", "alt" -> "Quiz 2 Photo", "width" ->"480"  ),
	        img.attr( "src" -> "images/gatheringMay2011/Quiz 3.jpg", "alt" -> "Quiz 3 Photo", "width" ->"480"  ),
	        img.attr( "src" -> "images/gatheringMay2011/Quiz 4.jpg", "alt" -> "Quiz 4 Photo", "width" ->"480"  ),
	        img.attr( "src" -> "images/gatheringMay2011/Trip 1.jpg", "alt" -> "Trip 1 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2011/Trip 2.jpg", "alt" -> "Trip 2 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2011/Trip 3.jpg", "alt" -> "Trip 3 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2011/Trip 4.jpg", "alt" -> "Trip 4 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2011/Trip 5.jpg", "alt" -> "Trip 5 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2011/Trip 6.jpg", "alt" -> "Trip 6 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2011/Trip 7.jpg", "alt" -> "Trip 7 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2011/Trip 8.jpg", "alt" -> "Trip 8 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2011/Trip 9.jpg", "alt" -> "Trip 9 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2011/Trip 10.jpg", "alt" -> "Trip 10 Photo", "width" ->"480" ),
	        img.attr( "src" -> "images/gatheringMay2011/Trip 11.jpg", "alt" -> "Trip 11 Photo", "width" ->"480" )

        )
	}
}