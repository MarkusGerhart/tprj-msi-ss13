name := "spray_editor_server"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.eclipse.emf" % "org.eclipse.emf.ecore" % "2.9.1-v20130827-0309",
  "org.eclipse.emf" % "org.eclipse.emf.ecore.xmi" % "2.9.1-v20130827-0309",
  "org.eclipse.emf" % "org.eclipse.emf.common" % "2.9.1-v20130827-0309"
)     

play.Project.playScalaSettings
