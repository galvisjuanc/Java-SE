package SortingMethods.Algorithm;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * @author galvi
 * Método de ordenamiento por selección: Buscar el número menor del arreglo e intercambiarlo por el que esté en la primera posición
 * Luego se busca el menor de los otros y así sucesivamente
 */
public class SelectionSorting {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, min, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos del arreglo"));

        arreglo = new int[nElementos];

        System.out.println("Completando el arreglo");
        for (int i = 0; i < nElementos; i++) {
            System.out.print((1+i) + ". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        //Ordenamiento por selección
        for (int i = 0; i < arreglo.length; i++) {
            min = i;                                        //variable que tendrá la posición
            for (int j = i+1; j < nElementos; j++) {        //ciclo para buscar en los demás elementos del arreglo
                if (arreglo[j] < arreglo[min]){             //si en la posición 1 es menor a la posición 0, entonces
                    min = j;                                // el puntero será igual a j, en este caso 1
                }           //Si no es menor, sigue buscando y seguirá intercambiando el número menor por el de la 1 pos
            }
            aux = arreglo[i];                               //aux será igual a arreglo[0]
            arreglo[i] = arreglo[min];                      //arreglo 0 será igual a arreglo en la posición 1
            arreglo[min] = aux;                             //arreglo en la posición 1 será igual a arreglo 0
        }
        System.out.println("\nArreglo ordenado de forma creciente");
        for (int elementos:arreglo) {
            System.out.print(elementos+" ");
        }
        System.out.println("\n\nArreglo ordenado de forma decreciente");
        for (int i = (nElementos -1); i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
