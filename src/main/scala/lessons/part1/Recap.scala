package lessons.part1

import scala.annotation.tailrec

object Recap extends App{

  val aCondidtion: Boolean = false
  val aConditionedVal = if (aCondidtion) 42 else 65

  val aCodeBlock = {
    //it will always return the last line so 54 is irrevelant
    if(aCondidtion) 54
    56
  }

  //unit = void
  val theUnit = println("hello, scala")

  //functions
  def aFuntion(x:Int): Int = x +1

  //recursion:Stack and tail
  //it makes tail recursion not use many stack frame
  @tailrec def factorial(n: Int, accumulator: Int): Int =
    if (n <= 0 ) accumulator
    else factorial(n-1, n * accumulator)

  println(factorial(4,1))

  // object oriented programming
  class Animal
  class Dog extends Animal
  val aDog: Animal = new Dog // subtyping polymorphism

  trait Carnivore {
    def eat(a: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override def eat(a: Animal): Unit = println("crunch!")
  }

  //method notations
  val aCroc = new Crocodile
  aCroc.eat(aDog)
  aCroc eat aDog // natural language

  //anonymous classes
  //we cannnot instantiate a trait or interface
  val aCarnivore = new Carnivore {
    override def eat(a: Animal): Unit = println("roar!")
  }

  //generics
  //+ sign means covariance
  abstract  class MyList[+A] // variance and variance problems in this course

  //single and companions
  object MyList

  //case classess
  case class Person(name:String, age: Int)

  //functional programming
  val incrementer = new Function1[Int, Int] {
    override def apply(v1: Int): Int = v1 +1
  }
  incrementer(1)

  val anonymousIncrementer = (x: Int) => x +1
  List(1,2,3).map(anonymousIncrementer) //HOF

  //for- comprehension
  val pairs = for {
    nums  <- List(1,2,3)
    char <- List('a','b', 'c')
  } yield nums + "-" + char



}
