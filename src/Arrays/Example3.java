package Arrays;

import java.util.Scanner;

/**
 * Ejercicio 3: Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden inverso al introducido
 * @author galvi
 */
public class Example3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float arreglo [] = new float[5];

        System.out.println("Mostrar inversos los números ingresados...");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextFloat();
        }
        System.out.println("Mostrando los números ingresados al contrario");
        for (int i = arreglo.length-1; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
