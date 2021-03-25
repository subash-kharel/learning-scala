//Scala - Arrays

object Demo {

  //declaring an array
  val myArray: Array[Int] = new Array[Int](4)

  //another way of declaring an array
  val myArray2 = new Array[Int](5)

  //another way of initializing an array
  val myArray3 = Array(1, 2, 3, 4, 5, 6)

  def main(args: Array[String]): Unit = {

    //assigning valaue to an array
    myArray(0) = 1
    myArray(1) = 2
    myArray(2) = 3
    myArray(3) = 4

    //this is just print the object reference which is why we needed the for loop
    println(myArray)

    for (x <- 0 to (myArray.length - 1)) {
      println(x)
    }

    val concatinatedArray = Array.concat(myArray, myArray2);
    println("concatination starts here---->")
    for (i <- concatinatedArray) {

      println(i)
    }


    //multi dimensional arrays

    //we need to import Array ._ to get all arrays libraries it is like * in java
    import Array._
    //this creates 2 /3 matrix
    var multiDim = ofDim[Int](2, 3)
    multiDim(1)(2) = 5
    for (i <- multiDim) {
      //this will print 000 and 005
      println(i.mkString)
    }

    //another way to print the string representation of the arrrays
    print(multiDim.map(_.mkString).mkString("\n"))
  }


  //Dynamic arrays - of variable size
  var arrays1 = scala.collection.mutable.Buffer[String]()
  arrays1 += "Ben"
  arrays1 += "Chrish"

  //arrays1 is an array buffer and we can increase the size of array as needed
  println(arrays1)
  //converting to array
  arrays1.toArray
  //convertin to list
  arrays1.toList

}
