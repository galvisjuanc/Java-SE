package Arrays;

import java.util.Scanner;

/* Ejercicio 5: Leer por teclado dos tablas de 10 números enteros y mezclarlas
 * en una tercera de la forma: el 1° de A, el 1° de B, el 2° de A, etc
 * @author galvi
 * */
public class Example5 {
     public static void main(String[] args) {
         //Declaración de variables
         Scanner entradatos = new Scanner(System.in);
         int arregloa[] = new int[10];
         int arreglob[] = new int[10];
         int arregloc[] = new int[20];

         System.out.println("Datos de entrada para Tabla 1");
         for (int i = 0; i < arregloa.length; i++) {
             System.out.print("Valor"+(i+1)+": ");
             arregloa[i]=entradatos.nextInt();
         }

         System.out.println("\nDatos de entrada para Tabla 2");
         for (int i = 0; i < arreglob.length; i++) {
             System.out.print("Valor"+(i+1)+": ");
             arreglob[i]=entradatos.nextInt();
         }
         int j = 0;
         System.out.println("\nDatos de entrada mezclados en una Tabla 3");
         for (int i = 0; i < arregloc.length; i+=2) {
             arregloc[i]=arregloa[j];
             arregloc[i+1]=arreglob[j];
             j++;
         }

         System.out.println("Datos Tabla 3");
         for (int i : arregloc) {
             System.out.print(i + " ");
         }

     }
}
