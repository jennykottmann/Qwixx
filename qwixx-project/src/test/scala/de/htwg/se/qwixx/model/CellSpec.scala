package de.htwg.se.qwixx.model

import org.scalamock.matchers
import org.scalatest.fixture.WordSpec
import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CellSpec extends WordSpec with Matchers{
  "A Cell" when { 
    "new" should {
      val cell = Cell(1,false)
      "have a value"  in {
        cell.value should be(1)
      }
      "have a boolean checked" in {
        cell.checked should be(false)
      }
    }
  }
//  "A Player" when { 
//    "new" should {
//      val player = Player("Your Name")
//      "have a name"  in {
//        player.name should be("Your Name")
//      }
//      "have a nice String representation" in {
//        player.toString should be("Your Name")
//      }
//    }
//  }
 
}