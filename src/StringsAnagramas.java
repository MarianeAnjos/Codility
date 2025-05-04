import java.util.Arrays;

public class StringsAnagramas {
   public static boolean saoAnagramas(String palavra1, String palavra2){
        if(palavra1.length() != palavra2.length()){
            return false;

        }
        char[] letras1 = palavra1.toCharArray();
        char[] letras2 = palavra2.toCharArray();

        return Arrays.equals(letras1, letras2);


   }
}
