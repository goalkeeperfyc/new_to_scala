package week1

object greatestCommonDivisor extends App {
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  val gcd_number = gcd(13, 39)
  println(gcd_number)

  println(gcd(14, 21))
  println(gcd(30, 15))
}
