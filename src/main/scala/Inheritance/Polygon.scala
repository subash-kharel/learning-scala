package Inheritance

//scala does not allow multiple inheritance
abstract class Polygon {

  def area: Double

}

//at least one method in trait should be abstract method
//traits are like interfaces
trait Shape {
  def color: String
}

 object Polygon {

  def printArea(p: Polygon): Unit ={
    println(p.area)
  }

  def main(args: Array[String]): Unit ={
    var rect = new Rectangle(55.2, 20.0)
    var triangle = new Triangle(10, 2)
    printArea(rect)
    println(rect.color)
    printArea(triangle)
    println(triangle.color)

  }

}
