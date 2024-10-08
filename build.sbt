name := "textteaser"

version := "1.0"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
    "com.google.code.gson" % "gson" % "2.3",
    "org.apache.opennlp" % "opennlp-tools" % "1.9.4",
    "net.codingwell" %% "scala-guice" % "4.0.0",
    "org.json4s" %% "json4s-native" % "4.0.4",
    "com.foursquare" %% "rogue-field" % "2.5.0" intransitive(),
    "com.foursquare" %% "rogue-core" % "2.5.1" intransitive(),
    "com.foursquare" %% "rogue-lift" % "2.5.1" intransitive(),
    "com.foursquare" %% "rogue-index" % "2.5.1" intransitive(),
    "net.liftweb" %% "lift-mongodb-record" % "2.6",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4",
    "ch.qos.logback" % "logback-classic" % "1.2.10",
    "com.google.guava" % "guava" % "18.0",
    "com.google.code.findbugs" % "jsr305" % "2.0.2",
    "org.scalatest" %% "scalatest" % "2.2.2" % "test"
)

resolvers += "OpenNLP Repository" at "https://opennlp.sourceforge.net/maven2/"

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases"

