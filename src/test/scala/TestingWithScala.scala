import org.junit.Assert.assertTrue
import org.junit.internal.runners.{JUnit38ClassRunner, JUnit4ClassRunner}
import org.junit.runner.RunWith


object TestingWithScala {

  import org.junit._

  object TestList {

    val myList = List(3, 5, 8, 9, 3)

    def getItem(itemPos: Int): Int = {
      if (itemPos > myList.length) {

        throw new Exception("Out of Bound")
      } else {
        myList(itemPos - 1)
      }
    }

    def getItemsGreaterThan(itemVal: Int): List[Int] = {
      val retList = for {
        item <- myList
        if (item > itemVal)
      } yield item
      retList
    }

  }

  @Test
  class JunitTestSuite {

    @Test
    def testValue() = assertTrue(TestList.getItem(2) == 5)
  }


}
