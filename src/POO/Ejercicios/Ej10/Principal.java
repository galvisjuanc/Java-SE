package POO.Ejercicios.Ej10;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        llenarPoligono();           // llenar un polígono
        mostrarResultados();        // mostrar datos de los polígonos
    }

    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("::... Menú del Programa ...::");
                System.out.println("Qué tipo de poligono desea: ");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opción --> ");

                opcion = entrada.nextInt();
            } while(opcion < 1 || opcion > 2);

            switch (opcion){
                case 1: //llenar un triangulo
                    llenarTriangulo();
                    break;
                case 2: // llenar un rectángulo
                    llenarRectangulo();
                    break;
            }

            System.out.print("\nDesea introducir otro polígono (S/N): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        } while(respuesta == 's' || respuesta == 'S');
    }

    public static void llenarTriangulo(){
        double l1;
        double l2;
        double l3;

        System.out.print("\nDigite el lado1 del triángulo: ");
        l1 = entrada.nextDouble();
        System.out.print("Digite el lado2 del triángulo: ");
        l2 = entrada.nextDouble();
        System.out.print("Digite el lado3 del triángulo: ");
        l3 = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(l1, l2, l3);
        poligono.add(triangulo);
    }

    public static void llenarRectangulo(){
        double l1, l2;

        System.out.print("\nDigite el lado1 del rectángulo: ");
        l1 = entrada.nextDouble();
        System.out.print("Digite el lado2 del rectángulo: ");
        l2 = entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(l1, l2);
        poligono.add(rectangulo);
    }

    public static void mostrarResultados(){
        for (Poligono poli: poligono) {
            System.out.println(poli.toString());
            System.out.println("Area = "+poli.area());
            System.out.println("");
        }
    }
}
