name := "scalachess"

organization := "org.lichess"

version := "5.3"

scalaVersion := "2.11.8"

libraryDependencies ++= List(
  "org.scalaz" %% "scalaz-core" % "7.1.11",
  "org.specs2" %% "specs2-core" % "3.6" % "test",
  "com.github.loloof64" % "scalalib" % "8779ab5c58",
  "joda-time" % "joda-time" % "2.9.7",
  "org.joda" % "joda-convert" % "1.8",
  "org.scala-lang.modules" %% "scala-java8-compat" % "0.8.0"
)

// updateOptions := updateOptions.value.withCachedResolution(true)

resolvers ++= Seq(
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases",
  "jitpack" at "https://jitpack.io"
)

scalacOptions ++= Seq(
  "-deprecation", "-unchecked", "-feature", "-language:_",
  "-Xfatal-warnings",
  "-Ywarn-unused-import", "-Ywarn-value-discard", "-Ywarn-dead-code",
  "-Ywarn-unused", "-Xlint:missing-interpolator",
  "-Ybackend:GenBCode", "-Ydelambdafy:method", "-target:jvm-1.8")
