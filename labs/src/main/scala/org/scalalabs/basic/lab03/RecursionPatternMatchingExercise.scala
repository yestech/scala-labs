package org.scalalabs.basic.lab03

/**
 * This exercise introduces you to pattern matching in combination with recursion.
 *
 * Recursion is a key concept for the functional style programming.
 * In the exercises below you learn how to apply recursion in combination with Scala's pattern matching facilities.
 *
 * For this exercise exclusively use pattern matching constructs in order to make the corresponding unittest work.
 *
 * Reference material to solve these exercises can be found here:
 * Pattern matching in general: http://programming-scala.labs.oreilly.com/ch03.html#PatternMatching
 * Pattern matching and recursion: http://programming-scala.labs.oreilly.com/ch08.html#Recursion
 */

object RecursionPatternMatchingExercise {

  /*************************************************************************
   * Recursive algorithms with pattern matching
   * For expected solution see unittest @RecursionPatternMatchingExerciseTest
   *************************************************************************/

  def compress[T](in: List[T]): List[T] = {
    //my version
    def trimDup(prev: T, list: List[T]): List[T] = list match {
      case Nil => List(prev)
      case (head :: tail) if (head == prev) => trimDup(head, tail)
      case (head :: tail) => prev :: trimDup(head, tail)
    }
    trimDup(in.head, in)

    //solutions version
    /*
    //built in:
    // in.distinct
    in match {
      case Nil => Nil
      case a :: b :: rest if a == b => compress(a :: rest)
      case a :: rest => a :: compress(rest)
    }
     */
  }

  def groupConsecutive[T](in: List[T]): List[List[T]] = {
//    def joinDups(prev: T, in: List[T]): List[T] = {
//      in match {
//        case Nil => Nil
//        case (head :: tail) if (head == prev) => prev :: joinDups (head, tail)
//        case (head :: tail) => groupConsecutive(tail)
//      }
//    }
//    List(joinDups(in.head, in))
    error("fix me")
  }

  def groupEquals[T](in: List[T]): List[List[T]] = {
    error("fix me")
  }

  def amountEqualMembers[T](in: List[T]): List[(Int, T)] = {
    error("fix me")
  }

  def zipMultiple(in: List[List[_]]): List[List[_]] = {
    error("fix me")
  }

  def zipMultipleWithDifferentSize(in: List[List[_]]): List[List[_]] = {
    error("fix me")
  }

}
