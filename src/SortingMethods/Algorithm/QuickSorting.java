package SortingMethods.Algorithm;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class QuickSorting {
    static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo;
        int cantidad;

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor entero para crear el tamaño del arreglo"));
        arreglo = new int[cantidad];

        System.out.println("Ingrese los valores para llenar el arreglo de tamaño "+cantidad+":");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i+1)+". valor: ");
            arreglo[i] = entrada.nextInt();
        }
        quickSort(arreglo,0,cantidad-1);
        System.out.print("\nValores del arreglo ordenado: ");
        for (int elemento:arreglo) {
            System.out.print(elemento + " ");
        }
    }
}
