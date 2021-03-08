//Scala - Arrays

object Demo {

  //declaring an array
  val myArray: Array[Int] = new Array[Int](4)

  //another way of declaring an array
  val myArray2 = new Array[Int](5)

  //another way of initializing an array
 val myArray3 = Array(1,2,3,4,5,6)
  def main(args: Array[String]): Unit = {

    //assigning valaue to an array
    myArray(0) = 1
    myArray(1) = 2
    myArray(2) = 3
    myArray(3) = 4

    //this is just print the object reference which is why we needed the for loop
    println(myArray)

    for(x <- 0 to (myArray.length -1)){
      println(x)
    }

    val concatinatedArray = Array.concat(myArray,myArray2);
    println ("concatination starts here---->")
     for(i <-concatinatedArray){

       println(i)
     }
}
}
