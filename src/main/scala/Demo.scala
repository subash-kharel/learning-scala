object Demo {

  object Math {
    def add(x : Int = 45, y : Int = 15): Int = {
      return x +y
    }

    //could use operaters in scala as function name.
    def +(x : Int = 45, y : Int = 15): Int = {
      return x +y
    }

    def square(x: Int) = x *x

  }


  // return type Unit is like a void in java
  def printExample(x: Int, y: Int): Unit = {
    println(x+y)
  }

  def main(args: Array[String]): Unit ={
    //This will word even though the method is expection 2 params because we have set the default values for the
    //parameters when the values are not provided.
      println(Math.add())

    //this we get result of 25 because this function will take 10 as the first parameter
      println(Math.add(10))

    //this will return 20
      println(Math.add(10, 10))

    //this will print result of x+y
     printExample(1,2)


    //This will print the sum of 1 and 4 and + is not the operator here but the funtionName.
    println( Math.+(1,4))

    //this is an example of anonymous function
    var add = (x:Int , y:Int)=>x+y
    println("THis is an example of anonymous function "+ add(1,3))

  }

}
