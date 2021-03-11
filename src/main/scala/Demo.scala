// Scala: Lazy Evaluation
//it is an evaluation is a strategy which delays an eval of an expression utils its value is needed. Scala support strict
//and lazy evaluation

//scala> var e =9
//var e: Int = 9
//
//scala> lazy val j = 10
//lazy val j: Int // unevaluated
//
//scala> j
//val res0: Int = 10

class strict {
  val e = {
    println("strict")
    9
  }
}

  class LazyEval {
    lazy val l = {
      println("lazy")
      10
    }

}
object Demo {

  def main(args:Array[String]): Unit ={

    val x = new strict
    val y = new LazyEval

    println(x.e)
    println(y.l)


  }
}
