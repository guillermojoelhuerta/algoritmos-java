import static java.lang.Character.toLowerCase;

/*
* Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
Your task is to write a function that takes a string and return a new string with all vowels removed.
For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
Note: for this kata y isn't considered a vowel.
* */

public class Troll {
    public static String disemvowel(String str) {
        char[] vocales = {'a','e','i', 'o', 'u'};
        String strTemp="";
        for(int x = 0; x < str.length(); x++){
            char letra = str.charAt(x);
            boolean esvocal = false;
            for(int y = 0; y < vocales.length; y++){
                if(toLowerCase(letra) == vocales[y]){
                    esvocal = true;
                }
            }
            if(!esvocal){
                strTemp+=letra;
            }
        }
        return strTemp;
    }
    public static void main(String[] args){
        Troll troll = new Troll();
        System.out.println(troll.disemvowel("This website is for losers LOL!"));
    }
}
