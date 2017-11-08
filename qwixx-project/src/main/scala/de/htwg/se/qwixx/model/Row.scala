package de.htwg.se.qwixx.model

case class Row(crossedRow:List[Int], closedFlag:Boolean, colour: String) {
  // Row besteht aus einer Liste (Int), einem Flag für closed und einer Farbe
  var crossed = List[Int]

  // Methode prüft, ob gewürfelte Zahl > bzw < des heads der Liste ist
  def crossPossible: Unit = {
  }


  // Methode zum ankreuzen (an Liste wird Zahl angehängt
  def cross {
    // neue Zahl soll vorne angehängt werden
  }
}