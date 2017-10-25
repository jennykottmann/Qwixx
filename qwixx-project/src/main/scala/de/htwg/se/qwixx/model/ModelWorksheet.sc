object ModelWorksheet {
  case class Cell(x: Int, y: Int)

  case class Field(cells: Array[Cell])

  val field1 = Field(Array.ofDim[Cell](1))

}