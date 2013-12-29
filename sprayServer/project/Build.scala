import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "sprayServer"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
    "org.eclipse.emf" % "org.eclipse.emf.ecore" % "2.9.1-v20130827-0309",
    "org.eclipse.emf" % "org.eclipse.emf.ecore.xmi" % "2.9.1-v20130827-0309",
    "org.eclipse.emf" % "org.eclipse.emf.common" % "2.9.1-v20130827-0309"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
