/*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
which is the number of times you must multiply the digits in num until you reach a single digit.

For example:
 persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
                      // and 4 has only one digit
 persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
                       // 1*2*6 = 12, and finally 1*2 = 2
 persistence(4) == 0 // because 4 is already a one-digit number
* */

import java.util.Arrays;

public class Persist {
    public static int persistence(long n) {
        // your code
        long[] nums;
        int result = 0, cifras = 0, cont = 0;
        do {
            cifras = cifrasNumero(n);
            nums = separateNumbers(n, cifras);
            if(cifras > 1) {
                for (int x = 0; x < nums.length; x++) {
                    if (x == 0) {
                        result = (int) nums[x];
                    } else {
                        result *= (int) nums[x];
                    }
                }
                cont++;
            }
            n = result;
        }while(cifras > 1);
        return cont;
    }
    public static int cifrasNumero(long num){
        int quantity = 0;
        do{
            num = num / 10;
            quantity++;
        }while(num > 0);
        return quantity;
    }

    public static long[] separateNumbers(long num, int tamArray){
        long[] numbers = new long[tamArray];
        int cont = tamArray - 1;
        long residuo = 0;
        do{
            residuo = num % 10;
            num = num / 10;
            numbers[cont] = residuo;
            cont--;
        }while(num > 0 && cont >= 0);
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(Persist.persistence(39));
    }
}
