//Scala - reduce, fold or scan (Left/Right)
//reduceLeft, reduceRight, foldLeft, foldRight, scanLeft, scanRight


object Demo {

  val lst = List(1,2,3,5,7,10,13)

  val lst2 = List("A", "B", "C")


  def main(args: Array[String]): Unit = {

    //first two item in list is added and again the result is added to the next item in the list
    //for this result is: ABC
    println(lst2.reduceLeft(_ + _))

    //the result here is: 41
    println(lst.reduceLeft(_ + _))

    //this is same as above
    println(lst.reduceLeft((x,y)=> x+y))

    //this shows the same result as above becase it is a
    //this will iterate the last two values and uses that result to do further processing to the next operation
    println(lst.reduceRight(_ +_))


    //this will add 5 to the total sum so result should be 41 +5  = 46
    // so 5 +1 = 6 +2 = 8 +........
    println(lst.foldLeft(5)(_ +_))
    //this prints ZABC
    println(lst2.foldLeft("Z")(_ + _))
    ///gives you all intermediate values
    //This is what the result looks like: List(100, 101, 103, 106, 111, 118, 128, 141)
    println(lst.scanLeft(100)(_ + _))

    //this is the result: List(z, zA, zAB, zABC)
    println(lst2.scanLeft("z")(_ +_))
  }
}
