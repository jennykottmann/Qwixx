package de.htwg.se.qwixx

import de.htwg.se.qwixx.model.Player
import de.htwg.se.qwixx.model.Player

object Qwixx {
  def main(args: Array[String]): Unit = {
    val student = Player("Your Name")
    println("Hello, " + student.name)
    
    
    
    println("Welcome to Qwixx")
  
  	// Klasse Cell
  	case class Cell(value:Int, checked:Boolean) {
      def isChecked = checked == true
      
//      public boolean isChecked() {
//        return checked == true;
//      }
    }
  	
    
    var reihe:Array[Cell] = new Array[Cell](11)
    
  		// Klasse Row
  	case class Row(reihe:Array[Cell], closedFlag:Boolean, colour: String) {
  	  // Konstruktor: Array von 11 Zellen wird angelegt
  	  // Methode zum aufsteigend/absteigend füllen
  	  
  	  def fillAsc {
  	    for (index <- 0 until reihe.length) {
  	      reihe(index) = new Cell(index+2, false)
//  	      println(reihe(index))
  	    }
  	  }
  	  
  	  def fillDesc {
  	    fillAsc
  	    reihe.reverse
  	    for (e <- reihe) println(e)
 
  	  }
  	 
  	 
  	}
  	
  	// Klasse Field
  	case class Field(player:String, redRow:Row, yellowRow:Row, greenRow:Row, blueRow:Row, fail:Int)
  
  	// Klasse Dice
  	case class Dice(colour:String, value:Int)
  
  	
  	// Instanz der Klasse Cell
  	var cell1=Cell(1,false)
  	println(cell1.isChecked)
  	
  
  	// Instanz der Klasse Row
  	var redRow = Row(reihe, false, "red")
  	redRow.fillDesc
  	
//  	println(redRow.cells(0))
  }
}
