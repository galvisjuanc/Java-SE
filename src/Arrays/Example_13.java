package Arrays;

import java.util.Scanner;

/**
 *
 * @author galvi
 * Ejercicio 13: Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares de
 * la primera, y a continuación los elementos impares. Se deben crear 3 arreglos.
 */
public class Example_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);   //Declarando las entradas por teclado
        int[] arreglo1 = new int[10];               //Declarando los arreglos
        int contador_pares = 0, contador_impares = 0;

        System.out.println("Digite 10 valores enteros: ");              //Leer datos para guardarlos en el arreglo principal

        for(int i = 0; i < arreglo1.length; i++){
            System.out.print("Valor "+(i+1)+": ");
            arreglo1[i] = entrada.nextInt();

            if(arreglo1[i] % 2 == 0)
                contador_pares++;

            if(arreglo1[i] % 2 == 1)
                contador_impares++;
        }

        System.out.println("\nDatos de la tabla actual");
        for(int e:arreglo1)
            System.out.print(e + " ");

        //Verificar los elementos del arreglo y guardarlos en el arreglo par o arreglo impar según el caso
        int[] arreglop = new int[contador_pares];               //Declarando los arreglos
        int[] arregloi = new int[contador_impares];               //Declarando los arreglos
        int punteropar = 0, punteroimpar = 0;

        for (int i = 0; i < arreglo1.length; i++) {
            if(arreglo1[i] % 2 == 0){
                arreglop[punteropar] = arreglo1[i];
                punteropar++;
            }
            else if(arreglo1[i] % 2 == 1){
                arregloi[punteroimpar] = arreglo1[i];
                punteroimpar++;
            }
        }
        System.out.println("\nDatos de la tabla actual par");
        for(int e:arreglop)
            System.out.print(e + " ");

        System.out.println("\nDatos de la tabla actual impar");
        for(int e:arregloi)
            System.out.print(e + " ");
    }
}
