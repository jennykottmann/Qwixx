object ModelWorksheet {
  //case class Cell(x: Int, y: Int)
  //case class Field(cells: Array[Cell])
  // val field1 = Field(Array.ofDim[Cell](1))
  
    println("Welcome to Qwixx  test")
  
  	// Klasse Cell
  	case class Cell(value:Int, checked:Boolean)
  	
  		// Klasse Row
  	case class Row(cells:Array[Cell], closedFlag:Boolean, colour: String)
  	
  	// Klasse Field
  	case class Field(player:String, redRow:Row, yellowRow:Row, greenRow:Row, blueRow:Row, fail:Int)
  
  	// Instanz der Klasse Cell
  	var cell1=Cell(1,false)
  
 
  
  	// Instanz der Klasse Row
  	var redRow = Row(Array(cell1), false, "red")
  	redRow.cells(0)
  	
  //	println(redRow.cells(0))

}