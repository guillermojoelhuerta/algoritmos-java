import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatin {
    public static String pigIt(String str) {
        // Write code here
        String stringTemp = "", palabra = "";
        Character letra;
        boolean ultimo = false;
        for (int x = 0; x < str.length(); x++){
            letra = str.charAt(x);
            ultimo = (x == str.length()-1) ? true : false;
            if(letra == ' ' || ultimo){
                palabra = ultimo ? (palabra + letra): palabra;
                stringTemp += convertirPalabra(palabra) + ((ultimo) ? "":" ");
                palabra = "";
            }else {
                palabra += letra;
            }
        }
        return stringTemp;
    }

    public static String convertirPalabra(String palabra){
        Pattern pat = Pattern.compile("[a-zA-Z]{1,}");
        String palabraTemp = "";
        Character letraTemp, letra1 = null;
        Matcher mat = pat.matcher(palabra);
        if (!mat.matches()) {
            return palabra;
        }
        for (int x = 0; x < palabra.length(); x++){
            letraTemp = palabra.charAt(x);
            if(x == 0){
                letra1 = palabra.charAt(x);
            }else{
                palabraTemp += letraTemp;
            }
        }
        return palabraTemp + letra1 + "ay";
    }

    public static void main(String[] args) {
        System.out.println(PigLatin.pigIt("Pig latin is cool !"));
    }
}
