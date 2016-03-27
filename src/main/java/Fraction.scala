
class Fraction(n: Int, d: Int) {

  require(d != 0)

  val nominator = n
  val denominator = d

  def this(num: Int) = {
    this(num, 1)
  }

  def *(mult: Fraction) = {
    new Fraction(nominator * mult.nominator, denominator * mult.denominator);
  }

  def +(addend: Fraction) = {
    if (denominator == addend.denominator)
      new Fraction(nominator + addend.nominator, denominator)
    else {
      val commonDen = denominator * addend.denominator
      val newNom = commonDen / denominator * nominator + commonDen / addend.denominator * addend.nominator
      new Fraction(newNom, commonDen)
    }
  }

  def canEqual(other: Any): Boolean = other.isInstanceOf[Fraction]

  override def equals(other: Any): Boolean = other match {
    case that: Fraction =>
      (that canEqual this) &&
        nominator == that.nominator &&
        denominator == that.denominator
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(nominator, denominator)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }

  override def toString() = {
    nominator + "/" + denominator
  }
}

object Fraction {

  def main(args: Array[String]) = {
    println(new Fraction(2, 3) * new Fraction(3, 5))
  }
}
