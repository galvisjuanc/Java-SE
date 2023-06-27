package SortingMethods.Algorithm;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * @author galvi
 * Método de ordenamiento por inserción: Si numeroIzquierda > numeroActual --> cambiamos los números
 *
 * 4 5 2 1 3 -- 4 5 2 1 3 -- 4 5 2 1 3 -- 4 2 5 1 3 -- 2 4 5 1 3
 * |              |              |          |          |
 */
public class InsertionSorting {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, posicion, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entero para asignarle la cantidad de elementos al arreglo"));

        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1) + ". Digite un número entero: ");
            arreglo[i] = entrada.nextInt();
        }

        //Insertion Sorting
        for (int i = 0; i < nElementos; i++) {
            posicion = i;
            aux = arreglo[i];
            /*Se crea la condición de la posición para que siempre mire a la izquierda y el número a la izquierda sea mayor que el número actual*/
            while((posicion > 0 ) && (arreglo[posicion - 1]) > aux){
                arreglo[posicion] = arreglo[posicion - 1];
                posicion--;
            }
            arreglo[posicion] = aux;
        }

        System.out.println("\nEl arreglo ordenado de forma creciente es: \n");
        for (int elementos:arreglo) {
            System.out.print(elementos + " ");
        }

        System.out.println("\nEl arreglo ordenado de forma decreciente es: \n");
        for (int i = (nElementos -1); i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }

    }
}
