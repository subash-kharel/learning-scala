//Scala - Lists
//Unlike arrays lists are immutable i.e. cannot change the value in the list once initialized.

//Cons is short for construct and comes from Lisp which has weird names for things; things like car and cdr.
//It means construct a new list.
//
//A cons A (or A :: B) means create a new list with A before B, where B can be a list item or a list itself and A is a list item.
object Demo {

  val myList: List[Int] = List(1,2,4,5,6);

  val myListOfNames: List[String] = List("Max", "Tom","Subash")

  def main(args: Array[String]): Unit = {

    //this will print List(1, 2, 4, 5, 6)
    println(myList);

    //this will print List(Max, Tom, Subash)
    println(myListOfNames)

    //O cons myList will prepend the 0 infront of a list
    println(0 :: myList)

    //this will print List(1, 5, 9) because Nil means empty list and it adds 1,2,9 on that empty list.
    println(1 :: 5 :: 9 :: Nil)

    //get first value of the list
    println(myList.head)

    //get all values that is not head
    println(myList.tail)

/*this  will print
  1
    2
    4
    5
    6 */

    myList.foreach(println)

    //This will add all items in the list and print the sum
    var sum: Int = 0
    //this _ is a placeholder which will be be stream of value coming from the list
    myList.foreach(sum += _)
    println(sum)

}
}
