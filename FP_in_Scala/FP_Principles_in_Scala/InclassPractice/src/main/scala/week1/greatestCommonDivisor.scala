package week1

object greatestCommonDivisor extends App {
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  println(gcd(14, 21))
}
