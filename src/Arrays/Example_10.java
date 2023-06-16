package Arrays;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author galvi
 * Ejercicio 10: Crear un programa que lea por teclado una tabla de 10 números enteros y
 * desplace N posiciones en el arreglo (N es digitado por el usuario)
 */
public class Example_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int arreglod[] = new int[10];
        int posiciones, puntero=0;

        System.out.println("Digite 10 valores para ingresar al arreglo...");
        for(int i=0; i < arreglo.length; i++) {
            System.out.print("Valor "+(i+1)+": ");
            arreglo[i]=entrada.nextInt();
        }
        System.out.println("Arreglo Inicial");
        for(int elemento:arreglo)
            System.out.print((elemento)+" ");

        posiciones = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor entero entre 1 y 9 para mover los valores del arreglo hacia la derecha"));

        int arreglodesplazado[] = new int[posiciones];

        for(int j = (arreglo.length-posiciones); j < arreglo.length; j++) {
            arreglodesplazado[puntero]=arreglo[j];
            puntero++;
        }

        System.out.println("\nArreglo Desplazado");
        for(int ele:arreglodesplazado)
            System.out.print((ele)+" ");


        for(int k = arreglo.length-1; k >= posiciones; k--) {
            arreglod[k] = arreglo[k-posiciones];
        }

        for(int l=0; l < arreglodesplazado.length; l++) {
            arreglod[l]=arreglodesplazado[l];
        }

        System.out.println("\nArreglo Desplazado Inicial");
        for(int elemento:arreglod)
            System.out.print((elemento)+" ");
    }
}
