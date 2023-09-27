package Exceptions.Exception_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Exception_2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Excepciones Verificadas. Si no coloco el IOException, Java no me permite ejecutar el programa porque el sabe que
        // puede saltar un error. Así que por eso obliga a que se arroje una posible excepción
        // Lectura de un archivo de texto (.txt)

/*        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\galvi\\Documents\\Excepciones\\TextoPrueba.txt"));
        String linea;
        while ((linea = bf.readLine()) != null){
            System.out.println(linea);
        }*/

        // Si el archivo se mueve, entonces saltará un IOException. El ejemplo anterior es una Excepción verificada.

        // Excepciones no Verificadas. División entre cero. Como el error ArithmeticException proviene de RunTimeException,
        // java no muestra que hay un error al momento de compilar pero si en la operación. Por eso debo arreglarlo.
        int num1, num2, resultado;
        num1 = 5;
        num2 = 0;
        resultado = num1 / num2;

        System.out.println("El resultado es: "+resultado);
    }
}
