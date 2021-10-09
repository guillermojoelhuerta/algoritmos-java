/*
A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */
import java.util.Arrays;
import static java.lang.Character.toUpperCase;

public class PangramChecker {
    public boolean check(String sentence){
        char[] abc = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String[][] table = new String[abc.length][2];
        char letter;
        for(int x = 0 ; x < abc.length; x++){
            letter = abc[x];
            table[x][0] = String.valueOf(letter);
            for (int y = 0; y < sentence.length(); y++){
                if(letter == toUpperCase(sentence.charAt(y))){
                    table[x][1] = "true";
                    break;
                }
            }
        }
        //System.out.println(Arrays.deepToString(table).replace("], ", "]\n"));
        for (int x = 0; x < table.length; x++){
            if(table[x][1] == null){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PangramChecker pangramChecker = new PangramChecker();
        System.out.println(pangramChecker.check("The quick brown fox jumps over the lazy dog"));
    }
}