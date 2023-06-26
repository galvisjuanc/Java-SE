package SortingMethods.Algorithm;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 * @author galvi
 * Método burbuja:
 * Si numeroActual > numeroSiguiente --> cambiamos los números
 *
 * 4 5 2 1 3 -- 4 2 5 1 3 -- 4 2 1 5 3 -- 4 2 1 3 5
 * 4 2 1 3 5 -- 2 4 1 3 5 -- 2 1 4 3 5 -- 2 1 3 4 5
 * 2 1 3 4 5 -- 1 2 3 4 5
 */
public class BubbleSorting {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entero para asignarle la cantidad de elementos al arreglo"));

        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1) + ". Digite un número entero: ");
            arreglo[i] = entrada.nextInt();
        }
        //Bubble Sort
        for (int i = 0; i < (nElementos-1); i++) {
            for (int j = 0; j < (nElementos - 1); j++) {
                if(arreglo[j] > arreglo [j+1]) {                // 4 5 2 1 3, si 5 > 2
                    aux = arreglo[j];                           // aux = 5
                    arreglo[j] = arreglo[j+1];                  // 4 2 2 1 3
                    arreglo[j+1] = aux;                         // 4 2 5 1 3
                }
            }
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
