object ModelWorksheet {
  //case class Cell(x: Int, y: Int)
  //case class Field(cells: Array[Cell])
  // val field1 = Field(Array.ofDim[Cell](1))
  
    println("Welcome to Qwixx  test")
  

  		// Klasse Row
			case class Row(crossedRow:List[Int], closedFlag:Boolean)
  	
  	// Klasse Field
  	case class Field(player:String, redRow:Row, yellowRow:Row, greenRow:Row, blueRow:Row, fail:Int)
  

  
  	// Instanz der Klasse Row
  	var redRow = Row(List(3,2,1), false)

  	
  //	println(redRow.cells(0))

}