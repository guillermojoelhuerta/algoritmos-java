import java.util.ArrayList;
import java.util.Arrays;
/*
Complete the solution so that it splits the string into pairs of two characters.
If the string contains an odd number of characters then it should replace the missing
second character of the final pair with an underscore ('_').

Examples:

StringSplit.solution("abc") // should return {"ab", "c_"}
StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
 */
public class StringSplit {
    public static String[] solution(String s) {
        //Write your code here
        int length = s.length();
        int dimension = length / 2 ;
        boolean par = true;
        if(length % 2 == 1){
            dimension += 1;
            par = false;
        }
        String[] arrLetras = new String[dimension];
        int idxArrLetras = 0, contTemp = 0;
        String stringTemp = "";
        for(int x = 0; x < length; x++){
            char letra = s.charAt(x);
            if(contTemp < 2){
                contTemp += 1;
                stringTemp += letra;
                if(stringTemp.length() == 2){
                    arrLetras[idxArrLetras] = stringTemp;
                    idxArrLetras++;
                    stringTemp = "";
                    contTemp = 0;
                }
                if(par == false && x == (length-1)){
                    stringTemp+="_";
                    arrLetras[idxArrLetras] = stringTemp;
                }
            }
        }
        System.out.println("final " + Arrays.toString(arrLetras));
        return arrLetras;
    }

    public static void main(String[] args){
        StringSplit stringSplit = new StringSplit();
        stringSplit.solution("guillermo");
    }
}