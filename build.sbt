name := "cluster-config"

version := "1.0"

scalaVersion := "2.11.11"
lazy val akkaVersion = "2.4.19"

libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
    "ch.qos.logback" % "logback-classic" % "1.2.3"
)