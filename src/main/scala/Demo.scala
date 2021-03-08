object Demo {

  def add(x : Int, y : Int): Int = {
    return x +y
  }

  def subtract(x : Int, y : Int): Int = {

    //return is optional in scala if the last line is the return.
     x - y
  }

  //return is also optional here.
  def multiply(x : Int, y : Int): Int = return x * y

  //if we are certain that the divide will always return integer then we can remove te return type as well
  def divide(x : Int, y : Int) =  x / y

  object Math {
    def add(x : Int, y : Int): Int = {
      return x +y
    }

    def square(x: Int) = x *x
  }

  def main(args: Array[String]): Unit ={

    println(add(3,2))
    println(subtract(3,2))
    println(multiply(3,2))
    println(divide(3,2))
    println(Math.add(4,5))
    //both ways to call square are valid
    println(Math.square(3))
    //this only works when function takes only one argument
    println(Math square 3)
  }

}
