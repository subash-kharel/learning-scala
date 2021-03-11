package Inheritance

class Rectangle(var width: Double, var height: Double) extends Polygon with Shape{

  //since rectangle is inheriting from parent polygon and it has same method name are we need to override
   override def area: Double = width * height

  override def color: String = "green"
}
