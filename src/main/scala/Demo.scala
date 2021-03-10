//Scala - Map

// you cannot have duplicate keys in a map ( if there are duplicates it will override the key using last key
object Demo {

  val myMap : Map[Int, String] = Map(101 -> "subash", 102 -> "minu")

  val myMap2 : Map[Int, String] = Map(103 -> "aurora")


  def main(args: Array[String]): Unit = {


    println(myMap)

    //get value using key
    println(myMap(101))

    println(myMap.keys)

    println(myMap.values)

    println(myMap.isEmpty)

    //iterating a map
    myMap.keys.foreach {
      key => println("Key : "+ key)
             println("value: "+ myMap(key))
    }

    //this checks if the key is present and will return a boolean
    println(myMap.contains(101))

    println(myMap ++ myMap2);
}
}
