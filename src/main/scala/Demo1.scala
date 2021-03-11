
object Demo1 {


  def method1 (n: Int): Unit = {
    println("Method 1")
    println(n)
  }

  //call by value parameter
  def method2 (n: => Int): Unit = {
    println("Method 2")
    println(n)
  }

  def main(args: Array[String]): Unit = {
    val add = (a: Int, b: Int) => {
      println("Add")
      a + b
    }

    method1(add (5,6))
    method2(add(5,6))
  }

}