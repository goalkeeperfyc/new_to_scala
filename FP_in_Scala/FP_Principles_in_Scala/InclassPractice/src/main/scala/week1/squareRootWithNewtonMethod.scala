package week1

object squareRootWithNewtonMethod extends App {
  /*1 + 3


     */
  def abs(x: Double) = if (x < 0) -x else x

  def sqrtIter(guess: Double, x: Double) : Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) / x < 0.001

  /* abs(guess * guess - x) / x is better than abs(guess * guess - x)
    we need to consider the absolute value of x
   */

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def sqrt(x: Double) = sqrtIter(1.0, x)

  println(sqrt(2))
  println(sqrt(4))
  println(sqrt(1000000))
  println(sqrt(0.000001))
}
