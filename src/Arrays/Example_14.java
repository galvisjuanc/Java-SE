package Arrays;

import java.util.Scanner;

/**
 * @author galvi
 * Ejercicio 14: Leer dos series de 10 enteros, que estarán ordenados crecientemente. COpiar (fusionar) las dos tablas
 * en una tercera, de forma que sigan ordenados.
 */
public class Example_14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);               // Objeto Scanner
        int[] arregloa = new int[10];
        int[] arreglob = new int[10];
        int[] arregloc = new int[20];

        System.out.println("Digite 10 valores enteros para llenar la tabla a (en orden creciente): ");
        for(int i = 0; i < arregloa.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arregloa[i] = entrada.nextInt();
        }

        System.out.println("Digite 10 valores enteros para llenar la tabla b (en orden creciente: ");
        for(int i = 0; i < arreglob.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglob[i] = entrada.nextInt();
        }

        System.out.println("\nDatos de la tabla actual arreglo a");
        for(int e:arregloa)
            System.out.print(e + " ");

        System.out.println("\nDatos de la tabla actual arreglo b");
        for(int e:arreglob)
            System.out.print(e + " ");

        //Fusionarlas en una tercera
        int punteroa = 0, punterob = 0;
        for (int i = 0; i < arregloc.length-1; i++) {
            if(arregloa[punteroa] < arreglob[punterob]){
                arregloc[i] = arregloa[punteroa];
                punteroa++;
            }
            else if(arreglob[punterob] < arregloa[punteroa]){
                arregloc[i] = arreglob[punterob];
                punterob++;
            }
        }

        if(punteroa == 10){
            arregloc[19] = arreglob[9];
        }
        else{
            arregloc[19] = arregloa[9];
        }
        System.out.println("\nDatos de la tabla actual arreglo c");
        for(int e:arregloc)
            System.out.print(e + " ");
    }
}
