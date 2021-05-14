import People.Person
import People.Person.unapply

object People extends App{

  class Person(val name:String, val age: Int)

  //internally for case classes there is unapply method that gets triggered to enable for pattern matching
  //so for our case we can do the same.
  object Person {
    def unapply(person: Person): Option[(String, Int)] = Some((person.name, person.age))

  }

  val bob = new Person("bob", 28)
  println("uapply-->", unapply(bob))
  val info = bob match {
    case Person(n,a) => s"my name is $n and i am $a years old"
  }
  println(info)

}
