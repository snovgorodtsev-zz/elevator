package com.slavka.elevator

import akka.actor.FSM
import com.slavka.elevator.Direction.Direction

class Elevator extends FSM[ElevatorState, ElevatorData] {
  startWith(Idle, ElevatorData())

  initialize()
}

// Elevator's state
private object Direction extends Enumeration {
  type Direction = Value
  val Up, Down = Value
}

sealed trait ElevatorState
private object Idle extends ElevatorState
private object Open extends ElevatorState
private case class Movement(direction: Direction) extends ElevatorState

// Elevator's data
class Floor(val value: Int = 0) extends AnyVal

case class ElevatorData(floor: Floor = new Floor())
