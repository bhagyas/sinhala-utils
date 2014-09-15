import org.apache.commons.lang3.StringUtils;
import scala.Char;

import java.util.ArrayList;

/**
 * Created by bhagyasilva on 15/09/14.
 */
public class SinGlishToUnicodeTransliterator extends Transliterator{
    private static int nVowels;
    private static String[] consonants = {"d","nndh","nng","Th","Dh","gh","Ch","ph","bh","sh","Sh","GN","KN","Lu","dh","ch","kh","th","t","k","d","n","p","b","m","\\u005C","+","y","Y","y","j","l","v","w","s","h","N","L","K","G","T","D","P","B","f","q","g", "r"};
    private static char[] consonantsUni = {'ඬ','ඳ','ඟ','ථ','ධ','ඝ','ඡ','ඵ','භ','ශ','ෂ','ඥ','ඤ','C','ද','ච','ඛ','ත', 'ට','ක','ඩ','න','ප','බ','ම','A','B','ය','ය','ය','ජ','ල','ව','ව','ස','හ','ණ','ළ','ඛ','ඝ','ඨ','ඪ','ඵ','ඹ','ෆ','ඣ','ග', 'ර'};
    private static String[]  vowels ={"oo","o\\)","oe","aa","a\\)","Aa","A\\)","ae","ii","i\\)","ie","ee","ea","e\\)","ei","uu","u\\)","au","/\\a","a","A","i","e","u","o","I"};
    private static char[] vowelsUni = {'ඌ','ඕ','ඕ','ආ','ආ','ඈ','ඈ','ඈ','ඊ','ඊ','ඊ','ඊ','ඒ','ඒ','ඒ','ඌ','ඌ','ඖ','ඇ','අ','ඇ','ඉ','එ','උ','ඔ','ඓ'  };
    private static char[] vowelModifiersUni = {'ූ','ෝ','ෝ','ා','ා','ෑ','ෑ','ෑ','ී','ී','ී','ී','ේ','ේ','ේ','ූ','ූ','ෞ','ැ','\u0000','ැ','ි','ෙ','ු','ො','ෛ'};
    private static String[] specialConsonants = {    "/\\\\n/g","/\\\\h/g","/\\\\N/g","/\\\\R/g","/R/g","/\\\\r/g"};
    private static char[]  specialConsonantsUni = {'ං','ඃ','ඞ','ඍ', 'X', 'Y'}
            ; private static char[] specialCharUni = {'ෲ','ෘ'};
    private static String[] specialChar = {"ruu", "ru"};

    {
        nVowels=26;
    }

    public static String transliterate(String text){
        String s,r,v;



        for (int i=0; i<specialConsonants.length; i++){
            text = StringUtils.replace(text, specialConsonants[i],Character.toString(specialConsonantsUni[i]));
        }
        //consonents + special Chars
        for (int i=0; i<specialCharUni.length; i++){
            for (int j=0;j<consonants.length;j++){
                s = consonants[j] + specialChar[i];
                v = ""+ ( consonantsUni[j] + specialCharUni[i]);
                r = s;
                text = StringUtils.replace(text, r, v);
            }
        }
        //consonants + Rakaransha + vowel modifiers
        for (int j=0;j<consonants.length;j++){
            for (int i=0;i<vowels.length;i++){
                s = consonants[j] + "r" + vowels[i];
                v = consonantsUni[j] + "්‍ර" + vowelModifiersUni[i];
                r = s;
                text = StringUtils.replace(text, r, v);
            }
            s = consonants[j] + "r";
            v = consonantsUni[j] + "්‍ර";
            r = s;
            text = StringUtils.replace(text, r, v);
        }
        //consonents + vowel modifiers
        for (int i=0;i<consonants.length;i++){
            for (int j=0;j<nVowels;j++){
                s = consonants[i]+vowels[j];
                v = "" + (consonantsUni[i] + vowelModifiersUni[j]);
                r = s;
                text = StringUtils.replace(text, r, v);
            }
        }

        //consonents + HAL
        for (int i=0; i<consonants.length; i++){
            r = consonants[i];
            text = StringUtils.replace(text, r, consonantsUni[i]+"්");
        }

        //vowels
        for (int i=0; i<vowels.length; i++){
            r = vowels[i];
            text = StringUtils.replace(text, r, _s(vowelsUni[i]));
        }

        return text;
    }

    static String _s(char c){
        return Character.toString(c);
    }
};
