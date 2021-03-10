//Scala - Class

//this is how you define class

//class User;

//creating class with constructer
//need to add var infront
//can add access modifier

//class User(var name: String, private var age: Int)


//you can add curly braces to add a method to a class to acess private values
class User(var name: String, private var age: Int){

  def printAge(age: Int): Unit = {
    println(s"The age is $age")
  }
}




//object means that this is singleton class we cannot create instance out of this object
object Demo {

  def main(args:Array[String]): Unit ={
    //creating an instance of class
    var user = new User("Max", 28)
    //this will print Max
    println(user.name)

    //overwriting name
    user.name = "subash"
    println(user.name)

    user.printAge(25)
  }
}
