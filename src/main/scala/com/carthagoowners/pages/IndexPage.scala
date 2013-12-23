package com.carthagoowners.pages

import scalatags._
import com.carthagoowners._

class IndexPage extends Page( "index" )
{
    val welcome = """|Carthago Owners UK is an informal group of like minded, discerning people who have chosen to own a Carthago motorhome.
		|Membership is free at present, and we hope to maintain this situation by utilising the Internet and e-mail as our means of keeping in touch with everyone.
    	|Membership is open to all Carthago owners in UK and to those English speaking owners abroad who would like to be kept informed of the UK based activities. We also welcome new members who are waiting for their new Carthago to arrive.
    	|The purpose of the group is to share information and experiences and to get together every so often at meetings both at home and abroad.
    	|It is an enthusiastic clan of people who share a love of their Carthago motorhomes, walking, cycling, nature, photography, history, music and much more. Our individual experience ranges from complete novices to people with many years and tens of thousands of miles of motorhome travels behind them.""".stripMargin
    
	def customContents() : Seq[HtmlTag] =
	{
	    Seq( h1l( "About Us" ) ) ++
	    welcome.split( "\n" ).map( l => p( l ) )
	}
}