package Arrays;

import javax.swing.*;
import java.util.Scanner;

/**
 *
 * @author galvi
 * Ejercicio 8: Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 números. Después se debe pedir un número y una posición,
 * insertarlo en la posición indicada, desplazando los que estén detrás.
 */
public class Example8 {
    public static void main(String[] args) {
        Scanner entradatos = new Scanner(System.in);
        int numero, posicion;
        int arreglo[] = new int[10];

        System.out.println("Digite 8 enteros para llenar el arreglo: ");
        for(int i= 0; i < 8; i++) {
            System.out.println("Valor "+(i+1)+": ");
            arreglo[i] = entradatos.nextInt();
        }

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para insertar en el arreglo"));
        posicion = Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion para insertar el numero anterior (un valor entre 1 y 8): "));

        //mover los valores. Si por ejemplo, digitan la posición 6, solo movería el total de los valores menos el valor. Una posición.

        for(int j = (arreglo.length-2); j >= (posicion - 1); j--) {
            arreglo[j+1] = arreglo[j];
            if((posicion - 1) == j) {
                arreglo[j] = numero;
            }
        }
        for(int elemento:arreglo) {
            System.out.print(elemento + " ");
        }

    }
}
