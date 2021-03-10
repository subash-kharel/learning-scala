//Scala - Options ( options is a container that give you two value, weather it give instance of some or none.

object Demo {

  val lst = List(1,2,3)
  val map = Map(1 ->"Tom", 2 -> "Max", 3 ->"John")

  //creating option and initializing empty.
  val opt: Option[Int] = None;

  val opt1: Option[Int] = Some(10)
  def main(args: Array[String]): Unit = {

    //this prints out None
   println( lst.find(_ > 6))

    //this will return 3
    println(lst.find(_ > 2).get)

    //this prints out Some(2)
    //options can give you two kind of result some or none.
    //find has a return type option
    println( lst.find(_ > 2))

    //way to handle when it cannot find
    println(lst.find(_>6).getOrElse(0))

    //this returns some(Tom)
    println(map.get(1))

    //this will give you the value just like in java i.e. option.get
    println(map.get(1).get)

    //with map.get(5) it will throw exception because there is no 5 so we need to do getorElse
    println(map.get(5).getOrElse("No name found"))

    //this should return true
    println(opt.isEmpty)

    //this should return false because opt1 is not empty
    println(opt1.isEmpty)
  }
}
