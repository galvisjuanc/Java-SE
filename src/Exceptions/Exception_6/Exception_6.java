package Exceptions.Exception_6;


import java.util.Scanner;

/**
 * Uso de throw para excepciones personalizada
 * */
public class Exception_6 {
    private int numero;
    private Scanner entrada;

    public void introducirNumeros() throws CeroException {
        entrada = new Scanner(System.in);

        do{
            System.out.print("Digite un número: ");
            numero = entrada.nextInt();

            if(numero == 0){
                throw new CeroException();
            }
        }while(numero != 0 && numero != 1);
    }

    public static void main(String[] args){
        Exception_6 ex6 = new Exception_6();
        try {
            ex6.introducirNumeros();
        } catch (CeroException e) {
            System.out.println("Ha introducido el cero. Error fatal! ---> " + e);
        }

        System.out.println("Programa terminado.");
    }
}
