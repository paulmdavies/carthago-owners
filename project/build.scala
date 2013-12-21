import sbt._
import Keys._

object CarthagoBuild extends Build
{
    lazy val carthagoOwners = Project( 
        id = "carthagoOwners",
        base = file( "." ),
        settings = Project.defaultSettings ++ Seq(
            libraryDependencies ++= Seq(
                "com.scalatags" % "scalatags_2.10" % "0.1.4"
            )
        )
    )
}
