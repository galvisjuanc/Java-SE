package Arrays;

import java.util.Scanner;

/**
 * Ejercicio 4: Leer 5 números por teclado, almacenarlos en un arreglo y a
 * continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros
 * @author galvi
 */
public class Example4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[5];

        float mediapositivos = 0, medianegativos = 0, contadorp=0, contadorn=0, contadorceros=0;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((1+i)+". Digite un número entero: ");
            arreglo[i] = entrada.nextInt();

            if(arreglo[i] > 0) {
                mediapositivos += arreglo[i];
                contadorp++;
            }
            else if(arreglo[i] < 0) {
                medianegativos += arreglo[i];
                contadorn++;
            }
            else {
                contadorceros++;
            }
        }

        System.out.println("La media de números positivos es: " + mediapositivos/contadorp);
        System.out.println("La media de números negativos es: " + medianegativos/contadorn);
        System.out.println("La cantidad de ceros es: " + contadorceros);

    }

}
