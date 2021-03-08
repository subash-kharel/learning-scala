//HIgher order functions are those functions which are abel to take functions as arguments and able to
//return function as a result

object Demo {

  def math( x:Double, y:Double,functionName: (Double, Double)=> Double): Double = functionName(x,y)

  def math( x:Double, y:Double, z: Double, functionName: (Double, Double)=> Double): Double = functionName(functionName(x,y),z)



  def main(args: Array[String]): Unit = {
    //this result constant takes two double values and the function to add as a parament
     val result = math(50, 20, (x,y)=>x+y)
    //this should pring 70
     println(result)

    val multiply = math(2,3, (x,y) => x*y)
    //this should pring 6.0
    println(multiply)

    //this will add the first two params first and the invokes the same function to add result to the third paramenter
    val addWithThreeArguments = math(1,2,3,(x,y)=> x+y)
    println(addWithThreeArguments)

    // using wildcard _ also does the same thing like the function above
    val addWithThreeArguments1 = math(1,2,3, _+_)
    println(addWithThreeArguments)

}
}
