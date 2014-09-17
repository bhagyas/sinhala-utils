/**
 * Created by bhagyasilva on 15/09/14.
 */
abstract class Transliterator {
  def transliterate(text:String):String
}

object TestTransliteration {
  def main(args: Array[String]): Unit ={
    println(SinGlishToUnicodeTransliterator.getInstance().transliterate("ammaa"))
    println(SinGlishToUnicodeTransliterator.getInstance().transliterate("thaaththaa"))
    println(SinGlishToUnicodeTransliterator.getInstance().transliterate("puthaa"))
    println(SinGlishToUnicodeTransliterator.getInstance().transliterate("dhuwa"))

    println(SinGlishPhoneticToUnicodeTransliterator.getInstance().transliterate("ammaa"))
    println(SinGlishPhoneticToUnicodeTransliterator.getInstance().transliterate("thaaththaa"))
    println(SinGlishPhoneticToUnicodeTransliterator.getInstance().transliterate("puthaa"))
    println(SinGlishPhoneticToUnicodeTransliterator.getInstance().transliterate("dhuwa"))
  }
}