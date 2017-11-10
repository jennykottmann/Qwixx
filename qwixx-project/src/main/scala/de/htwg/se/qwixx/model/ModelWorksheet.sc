object ModelWorksheet {

  println("Welcome to Qwixx  test")


  // Klasse Row
  case class Row(crossedRow: List[Int], closedFlag: Boolean) {

    def add(diceNumber: Int): Row = {
      // zuerst prüfen, ob gewürfelte Zahl angehängt werden darf
      // mit compare auf List
      if(diceNumber > crossedRow.head) {
        copy(crossedRow = diceNumber :: crossedRow)
      }
//      copy(crossedRow = diceNumber :: crossedRow)

    }
  }

  // Klasse Field
  case class Field(player: String, redRow: Row, yellowRow: Row, greenRow: Row, blueRow: Row, fail: Int)


  // Instanz der Klasse Row
  var redRow = Row(List(3, 2, 1), false)
  redRow = redRow.add(4)

  // Instanz der Klasse Row
  var redRow = Row(List(), false)
  redRow = redRow.add(4)


}