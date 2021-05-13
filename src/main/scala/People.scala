import People.Person

object People extends App{

  class Person(val name:String, val age: Int)

  object Person {
    def unapply(person: Person): Option[(String, Int)] = Some((person.name, person.age))

  }

  val bob = new Person("bob", 28)
  val info = bob match {
    case Person(n,a) => s"my name is $n and i am $a years old"
  }
  println(info)

}
