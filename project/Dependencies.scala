import sbt._

object Dependencies {
  private val akkaVersion = "2.5.1"
  private val scalaTestVersion = "3.0.0"

  val akka: Seq[ModuleID] = Seq(
    "com.typesafe.akka" %% "akka-actor",
    "com.typesafe.akka" %% "akka-testkit"
  ).map(_ % akkaVersion)

  val scalaTest: ModuleID = "org.scalatest" %% "scalatest" % scalaTestVersion
}