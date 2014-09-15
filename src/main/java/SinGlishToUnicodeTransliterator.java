//import org.apache.commons.lang3.StringUtils;
//import scala.Char;
//
//import java.util.ArrayList;
//
///**
// * Created by bhagyasilva on 15/09/14.
// */
//public class SinGlishToUnicodeTransliterator extends Transliterator{
//    private static int nVowels;
//    private static ArrayList<String> consonants = new ArrayList();
//    private static ArrayList<Character> consonantsUni = new ArrayList();
//    private static ArrayList<String> vowels = new ArrayList();
//    private static ArrayList<Character> vowelsUni = new ArrayList();
//    private static ArrayList<String> vowelModifiersUni = new ArrayList();
//    private static ArrayList<Character> specialConsonants = new ArrayList();
//    private static ArrayList<Character> specialConsonantsUni = new ArrayList();
//    private static ArrayList<Character> specialCharUni = new ArrayList();
//    private static ArrayList<Character> specialChar = new ArrayList();
//
//    {
//        vowelsUni.add(0, 'ඌ');    vowels.add(0, "oo");    vowelModifiersUni.add(0, "ූ");
//        vowelsUni.add(1, 'ඕ');    vowels.add(1, "o\\)");    vowelModifiersUni.add(1, "ෝ");
//        vowelsUni.add(2, 'ඕ');    vowels.add(2, "oe");    vowelModifiersUni.add(2, "ෝ");
//        vowelsUni.add(3, 'ආ');    vowels.add(3, "aa");    vowelModifiersUni.add(3, "ා");
//        vowelsUni.add(4, 'ආ');    vowels.add(4, "a\\)");    vowelModifiersUni.add(4, "ා");
//        vowelsUni.add(5, 'ඈ');    vowels.add(5, "Aa");    vowelModifiersUni.add(5, "ෑ");
//        vowelsUni.add(6, 'ඈ');    vowels.add(6, "A\\)");    vowelModifiersUni.add(6, "ෑ");
//        vowelsUni.add(7, 'ඈ');    vowels.add(7, "ae");    vowelModifiersUni.add(7, "ෑ");
//        vowelsUni.add(8, 'ඊ');    vowels.add(8, "ii");    vowelModifiersUni.add(8, "ී");
//        vowelsUni.add(9, 'ඊ');    vowels.add(9, "i\\)");    vowelModifiersUni.add(9, "ී");
//        vowelsUni.add(10, 'ඊ');    vowels.add(10, "ie");    vowelModifiersUni.add(10, "ී");
//        vowelsUni.add(11, 'ඊ');    vowels.add(11, "ee");    vowelModifiersUni.add(11, "ී");
//        vowelsUni.add(12, 'ඒ');    vowels.add(12, "ea");    vowelModifiersUni.add(12, "ේ");
//        vowelsUni.add(13, 'ඒ');    vowels.add(13, "e\\)");    vowelModifiersUni.add(13, "ේ");
//        vowelsUni.add(14, 'ඒ');    vowels.add(14, "ei");    vowelModifiersUni.add(14, "ේ");
//        vowelsUni.add(15, 'ඌ');    vowels.add(15, "uu");    vowelModifiersUni.add(15, "ූ");
//        vowelsUni.add(16, 'ඌ');    vowels.add(16, "u\\)");    vowelModifiersUni.add(16, "ූ");
//        vowelsUni.add(17, 'ඖ');    vowels.add(17, "au");    vowelModifiersUni.add(17, "ෞ");
//        vowelsUni.add(18, 'ඇ');    vowels.add(18, "/\\a");    vowelModifiersUni.add(18, "ැ");
//
//        vowelsUni.add(19, 'අ');    vowels.add(19, "a");    vowelModifiersUni.add(19, "");
//        vowelsUni.add(20, 'ඇ');    vowels.add(20, "A");    vowelModifiersUni.add(20, "ැ");
//        vowelsUni.add(21, 'ඉ');    vowels.add(21, "i");    vowelModifiersUni.add(21, "ි");
//        vowelsUni.add(22, 'එ');    vowels.add(22, "e");    vowelModifiersUni.add(22, "ෙ");
//        vowelsUni.add(23, 'උ');    vowels.add(23, "u");    vowelModifiersUni.add(23, "ු");
//        vowelsUni.add(24, 'ඔ');    vowels.add(24, "o");    vowelModifiersUni.add(24, "ො");
//        vowelsUni.add(25, 'ඓ');    vowels.add(25, "I");    vowelModifiersUni.add(25, "ෛ");
//        nVowels=26;
//
//        specialconsonantsUni.add(0, 'ං'); specialConsonants.add(0, "/\\\\n/g");
//        specialconsonantsUni.add(1, 'ඃ'); specialConsonants.add(1, "/\\\\h/g");
//        specialconsonantsUni.add(2, 'ඞ'); specialConsonants.add(2, "/\\\\N/g");
//        specialconsonantsUni.add(3, 'ඍ'); specialConsonants.add(3, "/\\\\R/g");
//        //special characher Repaya
//        specialConsonantsUni.add(4, 'ර්'+'\u200D'); specialConsonants.add(4, "/R/g");
//        specialConsonantsUni.add(5, 'ර්'+'\u200D'); specialConsonants.add(5, "/\\\\r/g");
//
//        consonantsUni.add(0, 'ඬ'); consonants.add(0, "nnd");
//        consonantsUni.add(1, 'ඳ'); consonants.add(1, "nndh");
//        consonantsUni.add(2, 'ඟ'); consonants.add(2, "nng");
//        consonantsUni.add(3, 'ථ'); consonants.add(3, "Th");
//        consonantsUni.add(4, 'ධ'); consonants.add(4, "Dh");
//        consonantsUni.add(5, 'ඝ'); consonants.add(5, "gh");
//        consonantsUni.add(6, 'ඡ'); consonants.add(6, "Ch");
//        consonantsUni.add(7, 'ඵ'); consonants.add(7, "ph");
//        consonantsUni.add(8, 'භ'); consonants.add(8, "bh");
//        consonantsUni.add(9, 'ශ'); consonants.add(9, "sh");
//        consonantsUni.add(10, 'ෂ'); consonants.add(10, "Sh");
//        consonantsUni.add(11, 'ඥ'); consonants.add(11, "GN");
//        consonantsUni.add(12, 'ඤ'); consonants.add(12, "KN");
//        consonantsUni.add(13, 'ළු'); consonants.add(13, "Lu");
//        consonantsUni.add(14, 'ද'); consonants.add(14, "dh");
//        consonantsUni.add(15, 'ච'); consonants.add(15, "ch");
//        consonantsUni.add(16, 'ඛ'); consonants.add(16, "kh");
//        consonantsUni.add(17, 'ත'); consonants.add(17, "th");
//
//        consonantsUni.add(18, 'ට'); consonants.add(18, "t");
//        consonantsUni.add(19, 'ක'); consonants.add(19, "k");
//        consonantsUni.add(20, 'ඩ'); consonants.add(20, "d");
//        consonantsUni.add(21, 'න'); consonants.add(21, "n");
//        consonantsUni.add(22, 'ප'); consonants.add(22, "p");
//        consonantsUni.add(23, 'බ'); consonants.add(23, "b");
//        consonantsUni.add(24, 'ම'); consonants.add(24, "m");
//        consonantsUni.add(25, '‍ය'); consonants.add(25, "\\u005C" + "y");
//        consonantsUni.add(26, '‍ය'); consonants.add(26, "Y");
//        consonantsUni.add(27, 'ය'); consonants.add(27, "y");
//        consonantsUni.add(28, 'ජ'); consonants.add(28, "j");
//        consonantsUni.add(29, 'ල'); consonants.add(29, "l");
//        consonantsUni.add(30, 'ව'); consonants.add(30, "v");
//        consonantsUni.add(31, 'ව'); consonants.add(31, "w");
//        consonantsUni.add(32, 'ස'); consonants.add(32, "s");
//        consonantsUni.add(33, 'හ'); consonants.add(33, "h");
//        consonantsUni.add(34, 'ණ'); consonants.add(34, "N");
//        consonantsUni.add(35, 'ළ'); consonants.add(35, "L");
//        consonantsUni.add(36, 'ඛ'); consonants.add(36, "K");
//        consonantsUni.add(37, 'ඝ'); consonants.add(37, "G");
//        consonantsUni.add(38, 'ඨ'); consonants.add(38, "T");
//        consonantsUni.add(39, 'ඪ'); consonants.add(39, "D");
//        consonantsUni.add(40, 'ඵ'); consonants.add(40, "P");
//        consonantsUni.add(41, 'ඹ'); consonants.add(41, "B");
//        consonantsUni.add(42, 'ෆ'); consonants.add(42, "f");
//        consonantsUni.add(43, 'ඣ'); consonants.add(43, "q");
//        consonantsUni.add(44, 'ග'); consonants.add(44, "g");
//        //last because we need to ommit this in dealing with Rakaransha
//        consonantsUni.add(45, 'ර'); consonants.add(45, "r");
//
//        specialCharUni.add(0, 'ෲ'); specialChar.add(0, "ruu");
//        specialCharUni.add(1, 'ෘ'); specialChar.add(1, "ru");
//        //specialCharUni.add(2,'්‍ර'); specialChar.add(2, "ra");
//    }
//
//    public static String transliterate(String text){
//        String s,r,v;
//        //special consonents
//        for (int i=0; i<specialConsonants.size(); i++){
//            text = StringUtils.replacePattern(text,specialConsonants.get(i).toString(), specialConsonantsUni.get(i).toString());
//        }
//        //consonents + special Chars
//        for (int i=0; i<specialCharUni.size(); i++){
//            for (int j=0;j<consonants.size();j++){
//                s = consonants.get(j) + specialChar.get(i);
//                v = consonantsUni.get(j) + specialCharUni.get(i).toString();
//                r = s;
//                text = StringUtils.replacePattern(text,r, v);
//            }
//        }
//        //consonants + Rakaransha + vowel modifiers
//        for (int j=0;j<consonants.size();j++){
//            for (int i=0;i<vowels.size();i++){
//                s = consonants.get(j) + "r" + vowels.get(i);
//                v = consonantsUni.get(j) + "්‍ර" + vowelModifiersUni.get(i);
//                r = s;
//                text = StringUtils.replacePattern(text,r, v);
//            }
//            s = consonants.get(j) + "r";
//            v = consonantsUni.get(j) + "්‍ර";
//            r = s;
//            text = StringUtils.replacePattern(text,r, v);
//        }
//        //consonents + vowel modifiers
//        for (int i=0;i<consonants.size();i++){
//            for (int j=0;j<nVowels;j++){
//                s = consonants.get(i)+vowels.get(j);
//                v = consonantsUni.get(i) + vowelModifiersUni.get(j);
//                r = s;
//                text = StringUtils.replacePattern(text,r, v);
//            }
//        }
//
//        //consonents + HAL
//        for (int i=0; i<consonants.size(); i++){
//            r = consonants.get(i);
//            text = StringUtils.replacePattern(text,r, consonantsUni.get(i)+"්");
//        }
//
//        //vowels
//        for (int i=0; i<vowels.size(); i++){
//            r = vowels.get(i);
//            text = StringUtils.replacePattern(text, r, vowelsUni.get(i).toString());
//        }
//        return text;
//    }
//
//}
