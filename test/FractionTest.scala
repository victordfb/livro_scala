import org.scalatest.{Matchers, FlatSpec}

class FractionTest extends FlatSpec with Matchers {

  "A Fraction" should "add with others Fractions of same denominator" in {

    val f1 = new Fraction(2, 3) + new Fraction(5, 3)
    f1 should be (new Fraction(7, 3))
  }

  it should "add with others Fractions of different denominator" in {

    val f1 = new Fraction(2, 3) + new Fraction(3, 5)
    f1 should be (new Fraction(19, 15))
  }

  it should "multiply with others Fractions" in {

    val f1 = new Fraction(2, 3) * new Fraction(3, 4)
    f1 should be (new Fraction(6, 12))
  }
}
