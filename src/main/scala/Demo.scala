//Scala - Auxilary

//  -------------- Getter    Setter
//  var           yes         yes
//  val           yes         no
//  default       no          no


// aux constructors are the alternative constructors for the class
class User(var name: String, private var age: Int){

  //whenever you create a auxillary constructor you need to call the previously defined constructor
  def this(){
    this("Tom", 32)
  }

  def this(name: String){
    this()
  }
}




//object means that this is singleton class we cannot create instance out of this object
object Demo {

  def main(args:Array[String]): Unit ={
    //creating an instance of class
    var user = new User("Max", 28)

  }
}
