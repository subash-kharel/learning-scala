import java.util.Date

object Demo {

  def main(args: Array[String]): Unit = {


    //regular threads
    //THis is like regular java way

    // concurrency package in scala

    import scala.concurrent._
    val simpleThread = new Thread(new Runnable {
      override def run(): Unit = println("THis is a simple thread")
    })
    simpleThread.run()

    //A more elaborate example
    //A typical consumer kinda usecase
    import java.util.concurrent.{BlockingQueue, LinkedBlockingDeque}

    class TestThread extends Runnable {

      val checkQueue: BlockingQueue[String] = new LinkedBlockingDeque[String]()

      def addtoQueue(elem: String): Unit = {
        checkQueue.add(elem)
      }

      def run(): Unit = {
        var continue = true
        println("Starting to take from Queue")
        while (continue) {
          var elem = checkQueue.take()
          println("Taken from queue :"+ elem + " at time "+ (new java.util.Date()).toString)
          if(elem.equals("end")){
            continue = false
          }

        }
        println("Completed taking from queue")
      }
    }

    //this is one way to manage threads to make sure it does not error out by using queues
    val testObject = new TestThread()
    (new Thread(testObject)).start()
    testObject.addtoQueue("First add")
    Thread.sleep(1000)
    testObject.addtoQueue("next element")
    Thread.sleep(2000)
    testObject.addtoQueue("end")
  }


}
