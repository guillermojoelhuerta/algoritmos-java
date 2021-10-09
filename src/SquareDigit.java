/*
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
For example, if we run 9119 through the function, 811181 will come out, because 9 elevado al 2 is 81 and 1 elevado al2 is 1.
Note: The function accepts an integer and returns an integer
 */
public class SquareDigit {

    public int squareDigits(int n) {

        String tempStringReturn = "";
        String tempString = Integer.toString(n);
        //System.out.println(" n= "+tempString);
        //System.out.println(" n= "+tempString.getClass());
        //System.out.println(" n= "+tempString.length());

        for(int x = 0; x < tempString.length(); x++){
            Character val = tempString.charAt(x);
            int num = Character.getNumericValue(val);
            num *= num;
            tempStringReturn += String.valueOf(num);
        }
        return Integer.parseInt(tempStringReturn);
    }

    public static void main(String[] args){
        SquareDigit squareDigit = new SquareDigit();
        System.out.println(squareDigit.squareDigits(91));
    }

}