import java.sql.SQLOutput;

/*
Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (like the name of this kata).
Strings passed in will consist of only letters and spaces.
Spaces will be included only when more than one word is present.
Examples:

spinWords("Hey fellow warriors") => "Hey wollef sroirraw"
spinWords("This is a test") => "This is a test"
spinWords("This is another test") => "This is rehtona test"
* */
public class SpinWords {

    public String spinWords(String sentence) {
        String sen = "";
        String[] arrSplit = sentence.split(" ");
        int cant = 0;
        for(String dia : arrSplit){
            cant++;
            int len = dia.length();
            if(len >= 5){
                String temp = "";
                for(int x = len - 1; x >= 0; x--){
                    temp+= dia.charAt(x);
                }
                sen = (cant == arrSplit.length)?(sen += temp): (sen += temp + " ");

            }else{
                sen = (cant == arrSplit.length)?(sen += dia): (sen += dia + " ");
            }
        }
        return sen;
    }

    public static void main(String[] ar) {
        SpinWords spinWords;
        spinWords = new SpinWords();
        System.out.println(spinWords.spinWords("Welcome"));
        System.out.println(spinWords.spinWords("Hey fellow warriors"));
    }
}