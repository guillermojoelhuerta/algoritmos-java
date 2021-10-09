/*
Description:
Complete the solution so that the function will break up camel casing, using a space between words.

Example
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
 */

public class SolutionCamelCase {

    public static String camelCase(String input) {
        String concatString = "";
        Character letter = null;
        for (int x = 0; x < input.length(); x++){
            letter = input.charAt(x);
            if(Character.isUpperCase(letter)){
                concatString = concatString + " " + letter;
            }else{
                concatString = concatString + letter;
            }
        }
        System.out.println("concatString = " + concatString);
        return concatString;
    }

    public static void main(String[] args) {
        SolutionCamelCase.camelCase("camelCasingTest");
    }
}
