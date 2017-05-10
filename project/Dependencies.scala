import sbt._

object Dependencies {
  private val akkaVersion = "2.5.1"

  val akka = Seq("com.typesafe.akka" %% "akka-actor" % akkaVersion)
}