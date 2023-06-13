package Arrays;

import java.util.Scanner;

/**
 * Ejercicio 2: Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducido
 */
public class Example2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1)+". Digite un número entero: ");
            array[i] = entrada.nextInt();
        }
        System.out.println("Valores impresos: ");
        for (int iterador : array) {
            System.out.print(iterador + " ");
        }
    }
}
