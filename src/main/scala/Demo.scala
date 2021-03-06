object Demo {

  def main(args: Array[String]): Unit ={
    println("Hello World!")
    val name = "subash"
    val age = 31
    //String interpolation using + (similar to java)
    println(name + " is " + age + " years old")
    //String interpolation using s (all dynamic variable are denoted by $)
    //This is called simple string interpolation
    println(s"$name is $age years old")
    //String interpolation making the values type safe
    //this would fail if lets say age was 31.2 or any other decimal because %d is ensuring that the value is integer
    //and %s is ensuring that the variable is of type string
    //This is also called formatted string interpolation
    println(f"$name%s is $age%d years old")

    //Simple string interpolation with escape character
    //this will print hello and world in different line as such:
    //hello
    //world
    println(s"Hello \nworld")

    //This is an example raw string interpolation
    //this will print hello \nworld in one line and will skip the \n because it prints the raw object.
    println(raw"hello \nworld")


  }

}
