/**
 * Created by bhagyasilva on 15/09/14.
 */
class Transliterator {


}

object TestTransliteration {
  def main(args: Array[String]): Unit ={
    println(SinGlishToUnicodeTransliterator.transliterate("ammaa"))
    println(SinGlishToUnicodeTransliterator.transliterate("thaaththaa"))
    println(SinGlishToUnicodeTransliterator.transliterate("puthaa"))
    println(SinGlishToUnicodeTransliterator.transliterate("dhuwa"))
  }
}