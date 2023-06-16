package Arrays;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author galvi
 * Ejercicio 11: Leer 5 elementos numéricos que se introducirán ordenados de forma creciente.
 * Estos los guardaremos en una tabla de tamaño 10. Luego, leer un número N, e insertarlo en
 * el lugar adecuado para que la tabla continúe ordenada.
 */
public class Example_11 {
    public static void main(String[] args) {
        Scanner entradatos = new Scanner(System.in);
        int[] arreglo = new int[10];
        System.out.println("Digitar 5 números enteros de forma creciente");

        for (int i = 0; i < arreglo.length - 5; i++) {
            System.out.print("Valor "+(i+1)+": ");
            arreglo[i] = entradatos.nextInt();
        }

        System.out.println("\nDatos de la tabla actual");
        for(int e:arreglo)
            System.out.print(e + " ");

        int numero, contador = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un número entero para guardar en la tabla"));

        System.out.println("\nVamos a insertar el número indicado para mantener la tabla ordenada");

        for(int j = arreglo.length - 6; j >= 0; j--) {
            if(numero > arreglo[j]) {
                arreglo[j+1] = numero;

                break;
            }
            else if (numero == arreglo[j]) {
                arreglo[contador] = arreglo[j];
            }
            else {
                contador++;
                arreglo[j+1] = arreglo[j];
            }
        }


        System.out.println("\nDatos de la tabla con el valor insertado");
        for(int e:arreglo)
            System.out.print(e + " ");

    }
}
