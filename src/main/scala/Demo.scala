import java.util.Date
import scala.concurrent.Promise
import scala.util.Success

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
          println("Taken from queue :" + elem + " at time " + (new java.util.Date()).toString)
          if (elem.equals("end")) {
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



    //how to use thread pool in scala
    //used to control the number of thread you use inside in app , instead of creating thread of all jobs better to use sleeping threads
    //better use this method so that we utilized the fullest of the resources and not have tons of unused resources

    import java.util.concurrent.{Executors, ExecutorService}
    val pool: ExecutorService = Executors.newFixedThreadPool(5)

    pool.execute(testObject)
    testObject.addtoQueue("First add")
    Thread.sleep(1000)
    testObject.addtoQueue("next element")
    Thread.sleep(2000)
    testObject.addtoQueue("end")


    //futures
    //it is a new scala feature not available in java(similar to completeable future in java)
    //future allows you to run a piece of code asynchronously in another threead whie the main thread continues with other work
    //future always returns a value
    //future is expected to eventually complete with a success or failure
    //Main thread cna wait ont he future to complete, act upon completion and act differently on success or on failure
    //call back can be registered for success or failure.

    //Needed to provide implicit context. Otherwise error
    import ExecutionContext.Implicits.global

    val futureVal: Future[Int] = Future {

      for (i <- 1 to 5) {
        //Sleeping inside future thread
        Thread.sleep(1000)
      }
      5
    }
    println("I am doing something else now...")
    //wait for completion
    while (!futureVal.isCompleted) {
      println("comp status :" + futureVal.isCompleted)
      Thread.sleep(1000)
    }
    println("comp status :" + futureVal.isCompleted)
    println(futureVal.value.get.get)


    //Register a call back

    import scala.util.{Success, Failure}

    val futureVal2: Future[Int] = Future {
      for (i <- 1 to 5) {
        //sleeping inside future thread
        Thread.sleep(1000)
      }
      //throw new Exception("Simulating error")
      5
    }

    futureVal2 onComplete {
      case Success(value) => println("this is onComplete " + value)
      case Failure(errorT) => println("An error has occured: " + errorT)
    }

    import scala.concurrent.duration._
    //this is better way to check and wait for 10 sec then while loop and check isComplete
    Await.result(futureVal2, 10.seconds)



    //promises
    //A promises allows two threads to use a future to work together
    //One thread provides value to the future
    //Second thread consumes the value once available
    //The main thread can still do its own thing
    // avoid thread sync issues

    import scala.concurrent.Promise

    println("-------------------------promises---------------------")
    //creating a promise
    val candyPromise = Promise[String]()
    //creating future associated with this promise
    val candyFuture = candyPromise.future

    //the future that provides value to the promise
    val makeCandy = Future {
         println("Making candy")
      Thread.sleep(2000)
      val candy = "Special candy"
      println("here is your candy -->"+ candy)
      candyPromise.success(candy)
      println("Continue other work")
    }

    //The future that consumes the value
    val eatCandy = Future {
      println("Waiting for candy")
      //Blocked here
      candyFuture onComplete{
        case Success(candy)=> println("Got my candy  :"+ candy)
      }
      //Continue

      //keep the main thread alive
      Thread.sleep(5000)
    }



  }







}
