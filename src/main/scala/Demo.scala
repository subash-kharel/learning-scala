//Scala - Arrays

object Demo {


  def main(args: Array[String]): Unit = {

    import scala.io.Source

    //this is will print out the current user directory
    println("Current directory: " + System.getProperty("user.dir"))

    val dataFile = "/Users/subashkharel/Documents/learning-scala/datafile.txt"

    //Source create from file
    val fileData = Source.fromFile(dataFile).getLines()
    //find number of lines with hello on it
    var helloCount = 0;
    for( line <- fileData){
      if( line.indexOf("hello") >= 0){
        helloCount += 1
      }
    }
    println("total hello's---> "+ helloCount)





    //save to a file
    import java.io._
    //this creates a new file demo.log
    val writer = new PrintWriter(new File("demo.log"))
    //this writes the value to the file
    writer.write(helloCount)
    writer.close()

    //reading from the webn in to source
    val webData = Source.fromURL("http://www.google.com")
    println(webData)
  }
}
