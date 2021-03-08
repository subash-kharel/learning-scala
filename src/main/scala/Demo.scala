//Scala- Closures
// A closure is a funtion which uses one or more variables declared outside this function.

object Demo {

  //if this number variable is a const value then it is called pure closure because the value cannot be
  //changed
  var number = 10;
  //this is an example of closure it uses variable number which is declared outside the function
  // number variable is also called free variable.
  val add = (x:Int) => x + number;

  var number1 = 20;
  val add1 = (x:Int)=> {
    number1 = x + number1;
    number1;
  }

  def main(args: Array[String]): Unit = {


    println(add(20))

    //overwriting the number1 value
   number1 = 100;
    println(add1(10))
}
}
