//Scala - Tuples
// It is a class that can contains different elements of different data types ( hetrogenous datatypes)
//Tuples are immutable so once defined it cannot be changed.
object Demo {

  //one way to declare a tuple
  val myTuple = (1, "Subash", true, '3');

  //second way to declare a tuple, the Number Tuple3 means that this tuple contains 3 elements
  //The most elements that can be added using this approach is 22
  val myTuple1 = new Tuple3(1, "Subash", false)

  def main(args: Array[String]): Unit = {


    println(myTuple)

    //this will print  subash because it will print second element in the tuple.
    println(myTuple._2)

    //this will print all elements in tuples, we used productIterator because i  can iterate over any type
    myTuple.productIterator.foreach{
      i => println(i)
    }

    //we could create a tuple this way as well, the result here looks like this: (1,subash)
    println(1 -> "subash")

    //the result looks like this: ((1,subash),true)
    println(1 -> "subash" -> true)



  }
}
