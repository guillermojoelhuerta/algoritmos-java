import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Create a function taking a positive integer as its parameter and returning a string containing
the Roman Numeral representation of that integer.

Modern Roman numerals are written by expressing each digit separately
starting with the left most digit and skipping any digit with a value of zero.
In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC.
2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.


Example:
conversion.solution(1000); //should return "M"
Help:

Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000
Remember that there can't be more than 3 identical symbols in a row.
 */

public class Conversion {
    public String solution(int num2) {
        String romano = "";
        while(num2 > 0){
            if(num2 >= 1000){
                romano += "M";
                num2 = num2 - 1000;
            }else if(num2 >= 900 && num2 < 1000){
                romano += "CM";
                num2 = num2 - 900;
            }else if(num2 >= 500 && num2 < 900){
                romano += "D";
                num2 = num2 - 500;
            }else if(num2 >= 400 && num2 < 500){
                romano += "CD";
                num2 = num2 - 400;
            }else if(num2 >= 100 && num2 < 400){
                romano += "C";
                num2 = num2 - 100;
            }else if(num2 >= 90 && num2 < 100){
                romano += "XC";
                num2 = num2 - 90;
            }else if(num2 >= 50 && num2 < 90){
                romano += "L";
                num2 = num2 - 50;
            }else if(num2 >= 40 && num2 < 50){
                romano += "XL";
                num2 = num2 - 40;
            }else if(num2  >= 10 && num2 < 40){
                romano += "X";
                num2 = num2 - 10;
            }else if(num2  < 10){
                romano += this.numeros1Cifra(num2);
                num2 = 0;
            }
        }
        return romano;
    }

    public String numeros1Cifra(int num){
        String romano = "";
        switch (num){
            case 1:
                romano = "I";
                break;
            case 2:
                romano = "II";
                break;
            case 3:
                romano = "III";
                break;
            case 4:
                romano = "IV";
                break;
            case 5:
                romano = "V";
                break;
            case 6:
                romano = "VI";
                break;
            case 7:
                romano = "VII";
                break;
            case 8:
                romano = "VIII";
                break;
            case 9:
                romano = "IX";
                break;
        }
        return romano;
    }

    public int concatArray(int[] num, int apartirde){
        String concat = "";
        for(int x = apartirde; x < num.length; x++){
            concat += num[x];
        }
        return Integer.valueOf(concat);
    }

    public int cifrasNumero(int num){
        int quantity = 0;
        do{
           num = num / 10;
           quantity++;
        }while(num > 0);
        return quantity;
    }

    public int[] separateNumbers(int num, int tamArray){
        int[] numbers = new int[tamArray];
        int cont = tamArray - 1;
        int residuo = 0;
        do{
            residuo = num % 10;
            num = num / 10;
            numbers[cont] = residuo;
            cont--;
        }while(num > 0 && cont >= 0);
        return numbers;
    }

    public static void main(String[] args){
        Conversion conversion = new Conversion();
        System.out.println(conversion.solution(1409));
    }
}
