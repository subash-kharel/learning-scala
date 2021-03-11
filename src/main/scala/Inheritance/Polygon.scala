package Inheritance

//abstract class cannot be instantiated
abstract class Polygon {

  //abstract method does not have body
  def area: Double;

}

object Polygon {

  def printArea(p: Polygon): Unit ={
    println(p.area)
  }

  def main(args: Array[String]): Unit ={
    var rect = new Rectangle(55.2, 20.0)
    var triangle = new Triangle(10, 2)
    printArea(rect)
    printArea(triangle)
  }

}
