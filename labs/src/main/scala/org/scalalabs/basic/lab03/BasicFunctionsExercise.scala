package org.scalalabs.basic.lab03

/**
 * This exercise introduces you to Scala functions.
 *
 * Functions let you create control abstractions, which give extra opportunities to condense
 * and simplify code.
 *
 * Provide a suitable implementation in order to make the corresponding unittest work.
 *
 * Reference material to solve these exercises can be found here:
 * Functional programming in general: http://programming-scala.labs.oreilly.com/ch08.html
 * Partial Functions: http://programming-scala.labs.oreilly.com/ch08.html#PartialFunctions
 * Currying: http://programming-scala.labs.oreilly.com/ch08.html#Currying
 */
object BasicFunctionsExercise {

  def plusOne(x: Int): Int = {
    val addOneTo = plus(1, _: Int)
    addOneTo(x)
  }

  def plus(x: Int, y: Int): Int = {
    x + y
  }

  def using[A <: {def close(): Unit}, B](closable: A)(f: A => B): B = {
    try {
      f(closable)
    } finally {
      closable.close()
    }
  }
}