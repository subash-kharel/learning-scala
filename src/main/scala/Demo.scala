import java.io.FileNotFoundException
//Scala - Exception Handling

class ExceptionTest(){

  @throws(classOf[Exception])
  def throwException() ={
    throw new Exception("This is how you throw exceptions")
  }

}


//object means that this is singleton class we cannot create instance out of this object
object Demo {

  def main(args: Array[String]): Unit = {

    var checkException = 5
    try {
      if (checkException == 5) {
        throw new Exception("Value is 5")
      }
    } catch {
      case ex: FileNotFoundException => {
        println("This is file not found exception : " + ex)
      }
      case ex: Exception => {
        println("This is regular exception: " + ex)
      }
    }
      finally
      {
        println("I am done")
      }
    }

  var ex  = new ExceptionTest
  try{
    ex.throwException()
  } catch {
    case exception: Exception => {
      println(exception)
    }
  }



}
