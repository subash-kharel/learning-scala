package Inheritance

class Polygon {

  def area: Double = 0.0;

}

object Polygon {

  def printArea(p: Polygon): Unit ={
    println(p.area)
  }

  def main(args: Array[String]): Unit ={
    var poly = new Polygon
    var rect = new Rectangle(55.2, 20.0)
    var triangle = new Triangle(10, 2)
    printArea(poly)
    printArea(rect)
    printArea(triangle)
  }

}
