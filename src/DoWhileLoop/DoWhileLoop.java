package DoWhileLoop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\nSelecciona el número de la opción deseada: ");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");
            System.out.print("\nOpción a elegir --> ");

            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0 -> System.out.println("Gracias por visitarnos");
                case 1 -> System.out.println("Movies");
                case 2 -> System.out.println("Series");
                default -> System.out.println("Selecciona una opción valida!");
            }
        }
        while(response != 0);
        System.out.println("Se terminó el programa :)");
    }
}
