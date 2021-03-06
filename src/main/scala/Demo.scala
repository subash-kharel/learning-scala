object Demo {

  //****NOte*****: there are println() few places just to print new lines for cleaner output.
  def main(args: Array[String]): Unit ={

    println()
    var x = 0
    while( x < 10){
      print(s"$x ")
      //cannot write x++ or x--;
      x+=1
    }
    println()

    var y = 0

    do{
      print(s"$y ")
      y += 1
    } while(y < 10)
  }

  println()
  // dont need to do var i because scala automatically makes i a var which is mutable.
//  for( i <- 1 to 5){
//    print(s"$i ")
//  }

  //this is same as above, to is a method that take one parameter
  for( i <- 1.to(5)){
    print(s"$i ")
  }

  println()

  //this also gives same result as above. So to and until are methods that gives us range.
  // the arrow is called generator
  for( i <- 1 until 6){
    print(s"$i ")
  }

  println()
  //nester for loops
  for(i <- 1 to 5; j <- 1 to 3){
    println(s"$i $j")
  }

  println()

  // creating a list and iterating over a list
  var list = List(1,2,3,4,5,6,7,8,9);
  for(i <- list){
    println(i)
  }

  println()

  // for loop with filters, this will onely print out 1,2,3,4,5
  for(i <- list; if i <6){
    println(i)
  }

  println()
  //using for loop as an expression

  //this should return the list of result and should look like this: List(1, 4, 9, 16, 25)
  var result = for { i <-list; if i<6} yield {
    i*i
  }
  println(result)

  //match as statement

  var age = 20

  age match {
    case 20 => println("age is "+age);
    case 30 => println("age is "+age);
    case 40 => println("age is "+age);
    case 50 => println("age is "+age);
    case 60 => println("age is "+age);
      //this last case is how to define default case
    case _ => println("default")

  }

  //match as expression

   var result1 = age match {
    case 20 => age
    case 30 => age
    case 40 => age
    case 50 => age
    case 60 => age
    case _ => println("default")
  }
  println(s"The age with match expression is $result1")

  //case statement where multiple checks could return same result
  var i = 7;

  i match {
    case 1|3|5|7|9 => println("odd")
    case 2|4|6|8|10 => println("even")
  }
}
