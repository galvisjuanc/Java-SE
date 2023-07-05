package SortingMethods.Algorithm;

import SortingMethods.Definition.SortAlgorithm;
import static SortingMethods.Algorithm.SortUtils.*;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * @author Varun Upadhyay (https://github.com/varunu28)
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 * @see SortAlgorithm
 */
public class QuickSort implements SortAlgorithm {
    /**
     * This method implements the Generic Quick Sort
     *
     * @param array The array to be sorted Sorts the array in increasing order
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        doSort(array, 0, array.length - 1);
        return array;
    }

    /**
     * The sorting process
     *
     * @param left The first index of an array
     * @param right The last index of an array
     * @param array The array to be sorted
     */
    private static <T extends Comparable<T>> void doSort(T[] array, int left, int right) {
        if (left < right) {
            int pivot = randomPartition(array, left, right);
            doSort(array, left, pivot - 1);
            doSort(array, pivot, right);
        }
    }

    /**
     * Ramdomize the array to avoid the basically ordered sequences
     *
     * @param array The array to be sorted
     * @param left The first index of an array
     * @param right The last index of an array
     * @return the partition index of the array
     */
    private static <T extends Comparable<T>> int randomPartition(T[] array, int left, int right) {
        int randomIndex = left + (int) (Math.random() * (right - left + 1));
        swap(array, randomIndex, right);
        return partition(array, left, right);
    }

    /**
     * This method finds the partition index for an array
     *
     * @param array The array to be sorted
     * @param left The first index of an array
     * @param right The last index of an array Finds the partition index of an
     * array
     */
    private static <T extends Comparable<T>> int partition(T[] array, int left, int right) {
        int mid = (left + right) >>> 1;
        T pivot = array[mid];

        while (left <= right) {
            while (less(array[left], pivot)) {
                ++left;
            }
            while (less(pivot, array[right])) {
                --right;
            }
            if (left <= right) {
                swap(array, left, right);
                ++left;
                --right;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer[] arreglo;
        int cantidad;

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor entero para crear el tamaño del arreglo"));
        arreglo = new Integer[cantidad];

        System.out.println("Ingrese los valores para llenar el arreglo de tamaño "+cantidad+":");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i+1)+". valor: ");
            arreglo[i] = entrada.nextInt();
        }
        QuickSort.doSort(arreglo,0,cantidad-1);
        System.out.print("\nValores del arreglo ordenado: ");
        for (int elemento:arreglo) {
            System.out.print(elemento + " ");
        }
    }
}
