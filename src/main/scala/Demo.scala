import java.util.Date
//partially applied functions

object Demo {


  def log(date: Date, message: String) = {
    println("this is "+ date.getHours + " hours and "+  date.getSeconds + " seconds with the message " + message)
  }

  def main(args: Array[String]): Unit = {

    val sum = (a: Int, b: Int, c: Int) => a +b +c

    //fully applied function example ( calling function will all arguments)
    println(sum(1,2,3));

    //this is an example of partially applied function, this will print 310
    var f = sum(10,_:Int,_ :Int)
    println(f(100,200));

    //this is also an example of partially applied function
    //we know the date will stay same through out while only message is changing so creating a function with _ as an argument
    //will make that argument a defined argument.
    val date = new Date
    val newLog = log(date, _ :String);
    newLog("This is message 1");
    newLog("This is message 2");
    newLog("This is message 3");

}
}
