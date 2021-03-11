package Inheritance

class Rectangle(var width: Double, var height: Double) extends Polygon {
  //dont need override when you extend abstract class
   def area: Double = width * height
}
