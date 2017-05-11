package com.slavka

import com.slavka.elevator.Direction.Direction

package object elevator {
  class Floor(val value: Int = 0) extends AnyVal
  object Direction extends Enumeration {
    type Direction = Value
    val Up, Down = Value
  }

  // Elevator's state
  private[elevator] sealed trait ElevatorState
  private[elevator] case object Idle extends ElevatorState
  private[elevator] case object Open extends ElevatorState
  private[elevator] case object Movement extends ElevatorState

  // Elevator's data
  case class ElevatorData(floor: Floor = new Floor(), direction: Option[Direction] = None)

  // Elevator's protocol
  case class PickUp(floor: Floor)
  case class PutDown(floor: Floor)
  case object GetCurrentFloor
}
