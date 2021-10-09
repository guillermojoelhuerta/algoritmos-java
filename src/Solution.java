import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;
/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized
(known as Upper Camel Case, also often referred to as Pascal case).

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
*/
public class Solution {
    static String toCamelCase(String s){
        int lon = s.length();
        String stringTemp = "";
        int capital_letter = 0;
        for (int x = 0; x < lon; x++){
            char letter = s.charAt(x);
            if(capital_letter > 0){
                letter = toUpperCase(letter);
            }
            if((letter != '_') && (letter != '-')){
                stringTemp += letter;
                capital_letter = 0;
            }else{
                capital_letter = x;
            }
        }
        return stringTemp;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.toCamelCase("esta_es_mi_palabra"));
    }
}
