class UmaClassQueNaoFazNada(private val s: String) {

  def run(): String = {
    s.reverse
  }

  def unary_~(): String = {
    (" " + s) * 2
  }

  def posfixEx(): String = {
    s + ". "
  }

  override def equals(outro: Any): Boolean =
    outro match {
      case outro: UmaClassQueNaoFazNada => s == outro.s
      case _ => false
    }
}

object UmaClassQueNaoFazNada {

  def main(args: Array[String]) {
    val nada: UmaClassQueNaoFazNada = new UmaClassQueNaoFazNada(args(0))
    val outra: UmaClassQueNaoFazNada = new UmaClassQueNaoFazNada("olaquetal")
    println(~nada)
    println(nada posfixEx)
    println(outra == nada)
    println(new String("..") == new String(".."))
  }
}
