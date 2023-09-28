package Exceptions.Exception_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Declaración Excepciones Verificadas
 * */
public class Exception_4 {
    public static void leerArchivo() throws IOException {
        File archivo = new File("C:\\Users\\galvi\\Documents\\Excepciones\\TextoPrueba.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;

        while((linea = bf.readLine()) != null){
            System.out.println(linea);
        }
    }

    public static void leerArchivo3() throws IOException {
        leerArchivo();
    }

    public static void main(String[] args) throws IOException {
        leerArchivo3();
    }
}
