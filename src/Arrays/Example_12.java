package Arrays;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * @author galvi
 * Ejercicio 12: Leer por teclado una tabla de 10 elementos numéricos enteros y una posición (entre 0 y 9).
 * Eliminar el elemento situado en la posición dada sin dejar huecos.
 * 3 2 5 4 1 13 15 8 9 7.  * Luego pedir posición. Ej: 4  * Borrar el número de esa posición y luego mover los numeros así
 * 3 2 5 4 13 15 8 9 7
 */
public class Example_12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        System.out.println("Digitar 10 números enteros para llenar el arreglo");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Valor "+(i+1)+": ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("\nDatos de la tabla actual");
        for(int e:arreglo)
            System.out.print(e + " ");

        int puntero = 0;
        do{
            puntero = Integer.parseInt(JOptionPane.showInputDialog("Digita un número entero entre 0 y 9 para borrar el número allí guardado"));
        }
        while (puntero < 0 || puntero > 9);

        System.out.println("\n\nPosición a borrar: "+puntero);

        for (int i = puntero; i < arreglo.length-1; i++)
            arreglo[i] = arreglo[i+1];

        System.out.println("\nNuevo arreglo modificado: \n");
        for(int j=0; j < 9; j++)
            System.out.println((j+1) + ". Elemento: " + arreglo[j]);

    }
}
