package org.scalalabs.basic.lab03

/**
 * This exercise introduces you to the powerful pattern matching features of Scala.
 *
 * Pattern matching can in its essence be compared to Java's 'switch' statement,
 * even though it provides many more possibilities. Whereas the Java switch statement
 * lets you 'match' primitive types up to int's, Scala's pattern matching goes much
 * further. Practically everything from all types of objects and Collections
 * can be matched, not forgetting xml and a special type of class called case classes.
 *
 * Pattern matching is also often used in combination with recursive algorithms.
 *
 * For this exercise exclusively use pattern matching constructs in order to make the
 * corresponding unit test work.
 *
 * Reference material to solve these exercises can be found here:
 * Pattern matching in general: http://programming-scala.labs.oreilly.com/ch03.html#PatternMatching
 * Pattern matching in combination with partial functions: http://programming-scala.labs.oreilly.com/ch08.html#PartialFunctions
 */

object BasicPatternMatchingExercise {

  /*************************************************************************
   * Basic pattern matching exercises
   * For expected solution see unittest @BasicPatternMatchingExerciseTest
   *************************************************************************/

  def describeLanguage(s: String) = {
    s match {
      case "Java" => "OOP"
      case "Smalltalk" => "OOP"
      case "Clojure" => "Functional"
      case "Haskell" => "Functional"
      case "Scala" => "Hybrid"
      case "C" => "Procedural"
      case _ => "Unknown"
    }
  }

  def matchOnInputType(in: Any) = in match {
    case s: String => "A string with length " + s.length
    case i: Int if i > 0 => "A positive integer"
    case i: Int if i < 0 => "A negative integer"
    case o: Option[_] => "A Scala Option subtype"
    case a: AnyRef => "Some Scala class"
    case _ => "A null value"
  }

  def older(p: Person): Option[String] = {
    //Need a person object because p is of type person
    p match {
      case Person(name,age) if age == 31 => Some("Jack")
      case _ => None
    }
  }

  /*************************************************************************
   * Pattern matching with partial functions
   * For expected solution see @BasicPatternMatchingExerciseTest
   *************************************************************************/

  val pf1: PartialFunction[String, String] = {
    case "scala-labs" => "found scala-labs"
    case "stuff" => "found stuff"
  }

  val pf2: PartialFunction[String, String] = {
    case "other stuff" => "found other stuff"
  }

  val pf3:PartialFunction[String, String] = {
    pf1 orElse pf2
  }

}

case class Person(name: String, age: Int)