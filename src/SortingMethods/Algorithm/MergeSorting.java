package SortingMethods.Algorithm;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class MergeSorting {
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
        //llamar método que hace el merge sort
        mergeSort(arreglo, 0, arreglo.length-1);        //Método creado fuera del main

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
     * Método vacío que no retorna nada. Requiere un arreglo y los índices del arreglo
     * Si derecha es menor o igual a la izquierda, hace un retorno del método. Es decir que llegó al centro
     * Variable mid que será el centro del arreglo
     * Se hace polimorfismo para usar el método ya creado y así, con este método se divide hasta terminar con la mitad del primer arreglo
     * Se hace polimorfismo nuevamente pero con el segundo arreglo. Es decir, desde la mitad hacia la derecha.
     * Al final se usa el otro método creado para fusionar los arreglos.
     */
    public static void mergeSort(int[] array, int left, int right) {
        if (right <= left) return;
        int mid = (left+right)/2;
        mergeSort(array, left, mid);
        mergeSort(array, mid+1, right);
        merge(array, left, mid, right);
    }
    /**
     * Metodo que hace el merge sorting
     */
    public static void merge(int[] array, int left, int mid, int right){
        // Calculando longitudes
        int lengthLeft = mid - left + 1;                //variable longitud arreglo izquierda
        int lengthRight = right - mid;                  //variable longitud arreglo derecha

        // creating temporary subarrays
        int leftArray[] = new int [lengthLeft];         //arreglos temporales del tamaño anterior
        int rightArray[] = new int [lengthRight];

        // copying our sorted subarrays into temporaries
        for (int i = 0; i < lengthLeft; i++)            //Se almacena en el arreglo temporal, la posición del arreglo izquierdo
            leftArray[i] = array[left+i];
        for (int i = 0; i < lengthRight; i++)           //Se almacena en el arreglo temporal, la posición del arreglo derecho
            rightArray[i] = array[mid+i+1];

        // iterators containing current index of temp subarrays
        int leftIndex = 0;                              //indice izquierdo de los arreglos temporales
        int rightIndex = 0;                             //indice derecho del arreglo temporal

        // copying from leftArray and rightArray back into array
        for (int i = left; i < right + 1; i++) {        //uniendo lo separado en un arreglo
            // if there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {       //Se revisa si esto se cumple para mover los valores
                if (leftArray[leftIndex] < rightArray[rightIndex]) {        //Si esto se cumple, se modifica el arreglo principal con el valor del arreglo temporal
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {                                  // Si no se cumple, se modifica el arreglo con el valor de la derecha
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // if all the elements have been copied from rightArray, copy the rest of leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // if all the elements have been copied from leftArray, copy the rest of rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
