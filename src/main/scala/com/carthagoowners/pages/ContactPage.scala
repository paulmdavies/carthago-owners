package com.carthagoowners.pages

import scalatags._

class ContactPage extends Page( "contact" )
{
    def emailInfo = """
		|If you have any information that you would like to share with fellow members please send the information to us via e-mail and we will distribute out to the membership list.
		|""".stripMargin 
    
	def customContents() : Seq[HtmlTag] =
	{
	    Seq(
            h1l( "Contact Us" ),
            p( "In order to keep operational costs to a minimum we ask that all communication is made via e-mail." ),
            h2l( "Contacting Other Members" ),
            p( "If you have any information that you would like to share with fellow members please send the information to us via e-mail and we will distribute out to the membership list." ),
            h2l( "New Members" ),
            p( "If you are not a member but would like to join please send us an email" ),
            p( "Please remember to include your name, as it's not always easy to work out from an email address!" ),
            h2l( "Privacy" ),
            p( "Your personal information and e-mail contact details will not be disclosed to other members without your consent and never to any third parties." )
	    )
	}
}