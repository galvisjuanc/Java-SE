package Arrays;

import java.util.Scanner;

/**
 * Ejercicio 6: Leer los datos correspondientes a dos tablas de 12 elementos
 * numéricos, y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B,
 * otros 3 de A, otros 3 de B, etc
 * @author galvi
 */
public class Example6 {
    public static void main(String[] args) {
        //declaracion de variables
        Scanner entrada = new Scanner(System.in);
        int tabla1[] = new int[12];
        int tabla2[] = new int[12];
        int tabla3[] = new int[24];

        System.out.println("Datos de entrada para Tabla 1");
        for (int i = 0; i < tabla1.length; i++) {
            System.out.print("Valor"+(i+1)+": ");
            tabla1[i]=entrada.nextInt();
        }

        System.out.println("\nDatos de entrada para Tabla 2");
        for (int i = 0; i < tabla2.length; i++) {
            System.out.print("Valor"+(i+1)+": ");
            tabla2[i]=entrada.nextInt();
        }
        int j = 0, k=0;
        System.out.println("\nDatos de entrada mezclados en una Tabla 3");

        for (int i = 0; i < tabla3.length; i+=6) {
            tabla3[i]=tabla1[j];
            j++;
            tabla3[i+1]=tabla1[j];
            j++;
            tabla3[i+2]=tabla1[j];
            j++;

            tabla3[i+3]=tabla2[k];
            k++;
            tabla3[i+4]=tabla2[k];
            k++;
            tabla3[i+5]=tabla2[k];
            k++;
        }

        System.out.println("Datos Tabla 3");
        for (int i : tabla3) {
            System.out.print(i + " ");
        }

    }
}
