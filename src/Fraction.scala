
class Fraction {
  val nominator: Int
  val denominator: Int

  def this(num: Int, den: Int) = {
    nominator = num
    denominator = den
  }

  def this(num: Int) = {
    this(num, 1)
  }
  def *(mult: Fraction) = {
    new Fraction(nominator * addend.nominator, denominator * addend.denominator);
  }

  override def toString() ={
    nominator + "/" + denominator
  }
}

object Fraction {

  def main(args: Array[String]) = {
    println(new Fraction(2, 3) * new Fraction(3, 5))
  }
}
