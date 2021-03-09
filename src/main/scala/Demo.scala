//Scala - Sets
object Demo {

  //sets are immutable in scala but we can make them mutable doing this:
  var mySetMutable = scala.collection.mutable.Set(1,2,3,4,4,5,6,7);

  var mySet: Set[Int] = Set(1,2,3,4,4,5,6,7,2)

  var mySet2 : Set[Int] = Set( 2,4,6,8,10)

  def main(args: Array[String]): Unit = {

    //this line with print: HashSet(1, 2, 3, 4, 5, 6, 7)
    println(mySetMutable)
    //making use of mutable set by adding to a set
    mySetMutable = mySetMutable+45
    //this line will print: HashSet(1, 2, 3, 4, 5, 6, 7, 45)
    println(mySetMutable)


    //checking if a value exist in a set, this will return true because 6 exists in the set mySet, Contains?
    println(mySet(6))

    //first element in the set
    println(mySet.head)
    //get all elements except head
    println(mySet.tail)

    //checks if the set is empty
    println(mySet.isEmpty)

    print("Concatinating two sets :")
    println(mySet ++ mySet2)

    print("Another way of Concatinating two sets :")
    println(mySet.++( mySet2))

    //This gives the common elements between two sets.
    println(mySet.&(mySet2))

    //this is same as above
    println(mySet.intersect(mySet2))

    //gets the max
    println(mySet.max)

    //prints every single elements in the set
    mySet.foreach(println)

    println("-------------")
    for(set <-mySet){
      println(set);
    }

}
}
