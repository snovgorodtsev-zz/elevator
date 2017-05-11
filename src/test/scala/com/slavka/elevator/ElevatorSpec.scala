package com.slavka.elevator

import akka.actor.ActorSystem
import akka.testkit.TestKit
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{Matchers, WordSpecLike}

class ElevatorSpec extends TestKit(ActorSystem("elevator-actor-system")) with WordSpecLike with Matchers
  with ScalaFutures {



}
