import java.util.Scanner;
public class MathClass {
    public static void main(String[] args) {
        String selector = "";
        double numUno, numDos;

        Scanner in = new Scanner(System.in);

        System.out.println("1 - Realizar potencias");
        System.out.println("2 - Obtener raiz cuadrada");
        System.out.println("3 - Encontrar el numero mayor");

        System.out.println("\nIngresa la operacion que deseas realizar: ");
        selector = in.nextLine();

        if (selector.equals("1")) {
            System.out.println("Ingresa el número a elevar: "); numUno = in.nextDouble();
            System.out.println("Ingresa la potencia: "); numDos = in.nextDouble();
            System.out.println(Math.pow(numUno,numDos));
        }
        if (selector.equals("2")) {
            System.out.println("Ingresa el numero: "); numUno = in.nextDouble();
            System.out.println(Math.sqrt(numUno));
        }
        if (selector.equals("3")) {
            System.out.println("Ingresa el primero número: "); numUno = in.nextDouble();
            System.out.println("Ingresa el segundo número: "); numDos = in.nextDouble();
            System.out.println(Math.max(numUno,numDos));
        }
    }

}
