package SortingMethods.Algorithm;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class HeapSorting {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);           //Entrada de datos por Sistema
        int arreglo[], nElementos;                          //Variables a utilizar
        //Pedir número de elementos deseados
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos del arreglo"));

        arreglo = new int[nElementos];                  //Tamaño del arreglo

        System.out.println("Completando el arreglo");
        for (int i = 0; i < nElementos; i++) {
            System.out.print((1+i) + ". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        //llamar método que hace el heap sort
        heapSort(arreglo);        //Método creado fuera del main

        System.out.println("\nImprimir el arreglo en forma creciente");
        for (int elementos:arreglo) {
            System.out.print(elementos+" ");
        }

        System.out.println("\n\nArreglo ordenado de forma decreciente");
        for (int i = (nElementos -1); i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
    }
    /**
     * Heap Sort. First: Divide into a tree
     */
    public static void heapify(int[] array, int length, int i) {
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        int largest = i;

        // if the left child is larger than parent
        if (leftChild < length && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        // if the right child is larger than parent
        if (rightChild < length && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        // if a swap needs to occur
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, length, largest);
        }
    }
    /**
     * Heap Sort. Second: Revisando cada valor del extremo con la raiz
     */
    public static void heapSort(int[] array) {
        if (array.length == 0) return;

        // Building the heap
        int length = array.length;
        // we're going from the first non-leaf to the root
        for (int i = length / 2-1; i >= 0; i--)
            heapify(array, length, i);

        for (int i = length-1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }
}
