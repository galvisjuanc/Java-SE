package Arrays;

import java.util.Scanner;

/**
 *
 * @author galvi
 * Ejercicio 9: Desplazar una posición en un arreglo. Crear un programa que lea por teclado una tabla de 10 números enteros y
 * la desplace una posición hacia abajo:
 * el primero pasa a ser el segundo, el segundo pasa a ser el tercero, y así sucesivamente. El último pasa a ser el primero.
 */
public class Example9 {
    public static void main(String[] args) {
        Scanner entradatos = new Scanner(System.in);
        int arreglo[] = new int[10];
        int valorf;

        System.out.println("Digite un valor entero para llenar un conjunto de datos:");
        for(int i = 0; i < arreglo.length; i++) {
            System.out.print("Valor "+(i+1)+": ");
            arreglo[i] = entradatos.nextInt();
        }
        valorf = arreglo[9];
        for(int j = 9; j > 0; j--) {
            arreglo[j] = arreglo[j-1];
        }
        arreglo[0] = valorf;
        for(int elemento:arreglo) {
            System.out.print(elemento + " ");
        }
    }
}
