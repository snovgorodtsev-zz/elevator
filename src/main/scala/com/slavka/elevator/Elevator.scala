package com.slavka.elevator

import akka.actor.FSM

class Elevator extends FSM[ElevatorState, ElevatorData] {
  startWith(Idle, ElevatorData())

  when(Idle) {
    case Event(PickUp(floor), data) => goto(Movement)
  }

  whenUnhandled {
    case Event(GetCurrentFloor, data) => sender() ! data.floor; stay()
  }

  initialize()
}