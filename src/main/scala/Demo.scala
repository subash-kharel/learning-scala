//Scala - map, filter


object Demo {

  val lst = List(1,2,3,4,5,6,10,13,15)

  val myMap = Map(1 ->"Subash", 2->"Minu", 3 -> "Aurora", 4 -> "Arish")

  def main(args: Array[String]): Unit = {

    //this will return the double of each number in the List lst.
    println(lst.map(_*2))

    //this is similar to how java does it and does the same thing as above
    println(lst.map(x => x *2))

    //this will print: List(hi(1,Subash), hi(2,Minu), hi(3,Aurora), hi(4,Arish))
    println(myMap.map(x => "hi" +x))

    //this will print: Map(1 -> Subash, 2 -> Minu, 3 -> Aurora, 4 -> Arish)
    println(myMap.view.mapValues(x =>x).toMap)

    //coverting a string to uppercase
    println("hello".map(_.toUpper))
    //printing list of list: List(List(1, 2, 3), List(3, 4, 5, 6))
    println(List(List(1,2,3), List(3,4,5,6)))

    //this flattens the both list: List(1, 2, 3, 3, 4, 5, 6)
    println(List(List(1,2,3), List(3,4,5,6)).flatten)

    //this will iterate over every element in the list and adds one to every element and return list of list
    //this will return:
    //List(List(1, 2), List(2, 3), List(3, 4), List(4, 5), List(5, 6), List(6, 7), List(10, 11), List(13, 14), List(15, 16))
    println(lst.map(x => List(x, x+1)))

    //this will return:List(1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 10, 11, 13, 14, 15, 16)
    println(lst.flatMap(x => List(x, x+1)))

    //this will filter through the list and return anything greater then a 5
    //The result looks like this: List(6, 10, 13, 15)
    println(lst.filter(x =>x >5))
  }
}
