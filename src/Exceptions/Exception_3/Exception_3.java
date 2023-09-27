package Exceptions.Exception_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exception_3 {
    public void leerArchivo() throws FileNotFoundException, IOException {
        File archivo = new File("C:\\Users\\galvi\\Documents\\Excepciones\\TextoPrueba1.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;

        while((linea = bf.readLine()) != null){
            System.out.println(linea);
        }
    }

    public void leerArchivo2(){
        try {
            leerArchivo();
        } catch (FileNotFoundException e) {
            System.out.println("Error Archivo --> "+e);
        } catch (IOException er){
            System.out.println("Error General --> "+er);
        }
        System.out.println("\nPrograma finalizado y-o terminado");
    }

    public static void main(String[] args) throws IOException {
        Exception_3 exc = new Exception_3();
        exc.leerArchivo2();
    }
}
