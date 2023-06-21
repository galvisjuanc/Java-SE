package Arrays;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * @author galvi
 * Ejercicio 15: Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en el arreglo. Se debe mostrar la posición
 * en que se encuentra. Si no está, indicarlo con un mensaje.
 */
public class Example_15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] arregloordenado = new int[10];
        int numeroabuscar, contador = 0;
        boolean creciente = true;
        System.out.println("Digite 10 números enteros de manera creciente... ");
        do{
            for(int i = 0; i < arregloordenado.length; i++) {
                System.out.print("Valor " + (i + 1) + ": ");
                arregloordenado[i] = entrada.nextInt();
            }
            //comprobar si está ordenado
            for(int i = 0; i < 9; i++){
                if(arregloordenado[i] < arregloordenado[i+1])
                    creciente = true;
                if(arregloordenado[i] > arregloordenado[i+1]) {
                    creciente = false;
                    break;
                }
            }
            if(creciente == false)
                System.out.println("\nEl arreglo está desordenado, vuelva a digitar...");
        }
        while (creciente == false);

        numeroabuscar = Integer.parseInt(JOptionPane.showInputDialog("Digita un número entero para verificar si está en el arreglo"));

        for (int i = 0; i < arregloordenado.length; i++) {
            if(arregloordenado[i] == numeroabuscar){
                System.out.println("El número a buscar está en la posición "+(i+1)+" del arreglo");
                break;
            }
            else{
                contador++;
                if(contador == 10) {
                    System.out.println("\nEl numero a buscar no está en ninguna parte del arreglo");
                    break;
                }
            }
        }
        System.out.println("\nArreglo ordenado digitado:");
        for (int e:arregloordenado) {
            System.out.print(e+" ");
        }
    }
}
