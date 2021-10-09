/*
Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.

Examples
Valid arrays
a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144, 361 the square of 19, 25921 the square of 161, and so on. It gets obvious if we write b's elements in terms of squares:

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
Invalid arrays
If, for example, we change the first number to something else, comp may not return true anymore:

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
comp(a,b) returns false because in b 132 is not the square of any number of a.

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
comp(a,b) returns false because in b 36100 is not the square of any number of a.

Remarks
a or b might be [] or {} (all languages except R, Shell).
a or b might be nil or null or None or nothing (except in C++, Elixir, Haskell, PureScript, Pascal, Perl, R, Rust, Shell).
If a or b are nil (or null or None, depending on the language), the problem doesn't make sense so return false.

Note for C
The two arrays have the same size (> 0) given as parameter in function comp.
* */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if(a == null || b == null){
            return false;
        }else if(a.length == 0 && b.length == 0){
            return true;
        }

        int valor_temp, cont = 0;
        boolean result = false;

        int[][] registros = new int[a.length][2];
        for (int z = 0; z < registros.length; z++){
            registros[z][1] = -1;
        }

        for(int  x = 0; x < a.length; x++){
            valor_temp = a[x] * a[x];
            registros[x][0] = a[x];
            for (int y = 0; y < b.length; y++){
                if(valor_temp == b[y]){
                    List<Integer> miLista = returnListaY(registros, y);
                    if(miLista.size() == 0 || !returnValorList(miLista, y)) {
                        registros[x][1] = y;
                        cont = cont + 1;
                        break;
                    }
                }
            }
        }
        //System.out.println(Arrays.deepToString(registros).replace("], ", "]\n"));
        if(a.length == b.length && cont == a.length){
            result = true;
        }
        return result;
    }

    public static List returnListaY(int[][] regis, int y){
        List<Integer> miLista = new ArrayList<Integer>();
        for (int x = 0; x < regis.length; x++){
            if(regis[x][1] == y) {
                miLista.add(y);
            }
        }
        return miLista;
    }


    public static boolean returnValorList(List<Integer> regis, int y){
        for (int x = 0; x < regis.size(); x++){
            if(regis.get(x) == y) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        //int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        //int[] b = {121, 14641, 20736, 36100, 25921, 361, 20736, 361};
        AreSame areSame = new AreSame();
        int[] x ={};
        System.out.println(areSame.comp(x, null));
    }
}
