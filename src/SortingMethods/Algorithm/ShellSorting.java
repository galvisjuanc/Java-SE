package SortingMethods.Algorithm;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class ShellSorting {
    public static void shell(int A[]) {

        int salto, aux, i;
        boolean cambios;

        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento
                cambios = false;
                for (i = salto; i < A.length; i++)   // se da una pasada
                {
                    if (A[i - salto] > A[i]) {       // y si están desordenados
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.
                    }
                }
            }
        }
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
        shell(arreglo);
        System.out.println("Valores del arreglo ordenado: ");
        for (int elemento:arreglo) {
            System.out.print(elemento + " ");
        }
    }
}
