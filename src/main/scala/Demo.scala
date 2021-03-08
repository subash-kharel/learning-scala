// Scala - Currying
//Currying is a technique of transforming a function that takes multiple arguments in to a funtion
//  that takes a single argument

object Demo {

  def add (x:Int, y:Int) = x +y


  //transforming above function in to currying technique

  def add1(x:Int) = (y : Int) => x +y

  //scala way of defining a currying function
  def add2(x:Int) (y:Int) = x+y

  def main(args: Array[String]): Unit = {

    println(add(20,10))
// implementating curying
    println(add1(20)(10))

    //another way of implementing currying
    val sum40 = add1(40);
    println(sum40(100))
}
}
