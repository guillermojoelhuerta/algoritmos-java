/*
Given two integers a and b, which can be positive or negative,
find the sum of all the integers between and including them and return it.
If the two numbers are equal return a or b.

Note: a and b are not ordered!
*/
public class Sum
{
    public int GetSum(int a, int b)
    {
        if( a == b){
            return a;
        }

        int mayor = 0, menor = 0, suma = 0;

        if(a > b){
            mayor = a;
            menor = b;
        }

        if(b > a){
            mayor = b;
            menor = a;
        }

        for(int x = menor; x <= mayor; x++){
            suma += x;
        }

        return suma;
    }

    public static void main(String[] args){
        Sum sum = new Sum();
        System.out.println(sum.GetSum(5,-1));
    }
}