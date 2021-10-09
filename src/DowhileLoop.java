import java.util.Scanner;

public class DowhileLoop {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Selecciona el número de la opció deseada");
            System.out.println("1. movies");
            System.out.println("2. series");
            System.out.println("0. Salir");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 0:
                    System.out.println("Gracias por visitarnos");
                case 1:
                    System.out.println("Movies");
                case 3:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
                    break;
            }
        }while(response != 0);
        System.out.println("Se terminó el programa");
    }
}
