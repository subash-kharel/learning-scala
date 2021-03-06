object Demo {

  def main(args: Array[String]): Unit ={
    val x = 50
    val y =10;
    if(x == 50){
      println(s"The value of x is $x")
    } else {
      println(s"The value of x is not 50")
    }

    //this is if expression
    val result = if(y == 10) "y == 10" else "y != 10"
    //or
    //println(if(y == 10) "y == 10" else "y != 10")
    println(result);

  }

}
