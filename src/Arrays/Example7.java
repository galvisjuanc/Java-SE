package Arrays;

import java.util.Scanner;
/**
 * Ejercicio 7: Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están
 * ordenados de forma creciente, decreciente o si están desordenados.
 * @author galvi
 */
public class Example7 {
    public static void main(String[] args) {
        Scanner entradatos = new Scanner(System.in);
        int tabla1[] = new int[10];
        int contador = 0;
        System.out.println("Digite 10 números enteros: ");
        for (int i = 0; i < tabla1.length; i++) {
            System.out.print("Valor "+(i+1)+": ");
            tabla1[i] = entradatos.nextInt();
            contador++;
            if(contador == 10) {
                if(tabla1[0] < tabla1[1] && tabla1[1] < tabla1[2] && tabla1[2] < tabla1[3] && tabla1[3] < tabla1[4] && tabla1[4] < tabla1[5]
                        && tabla1[5] < tabla1[6] && tabla1[6] < tabla1[7] && tabla1[7] < tabla1[8] && tabla1[8] < tabla1[9]) {
                    System.out.println("El arreglo está ordenado de forma creciente");
                }
                else if(tabla1[9] < tabla1[8] && tabla1[8] < tabla1[7] && tabla1[7] < tabla1[6] && tabla1[6] < tabla1[5] && tabla1[5] < tabla1[4]
                        && tabla1[4] < tabla1[3] && tabla1[3] < tabla1[2] && tabla1[2] < tabla1[1] && tabla1[1] < tabla1[0]) {
                    System.out.println("El arreglo está ordenado de forma decreciente");
                }
                else {
                    System.out.println("El arreglo está desordenado");
                }
            }
        }
        for(int j:tabla1)
            System.out.print(j + " ");

        /*
         * boolean creciente = false, decreciente = false
         * for(int i = 0; i < 9 ; i++){
         * 		if(Arreglo[i] < arreglo[i+1]){
         * 			creciente  = true;
         *
         * 		}
         * 		if arreglo[i] > arreglo[i+1]){
         * 			decreciente = true;
         * 		}
         * }
         *
         * if(creciente == true && decreciente == false) -> el arreglo es creciente
         *
         * else if(creciente == false && decreciente == true -> el arreglo es decreciente
         *
         * else (creciente == true && decreciente == true)
         * 		{
         * 			-> el arreglo está desordenado
         * 		}
         *
         * */
    }
}
