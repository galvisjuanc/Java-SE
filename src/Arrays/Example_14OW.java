package Arrays;

import java.util.Scanner;
public class Example_14OW {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];
        boolean creciente = true;

        a = new int[10];
        b = new int[10];
        c = new int[20];

        System.out.println("Digite el primer arreglo: ");
        do{
            for(int i = 0; i < a.length; i++) {
                System.out.print("Valor " + (i + 1) + ": ");
                a[i] = entrada.nextInt();
            }
            //comprobar si está ordenado
            for(int i = 0; i < 9; i++){
                if(a[i] < a[i+1])
                    creciente = true;
                if(a[i] > a[i+1]) {
                    creciente = false;
                    break;
                }
            }
            if(creciente == false)
                System.out.println("\nEl arreglo está desordenado, vuelva a digitar...");
        }
        while (creciente == false);

        System.out.println("Digite el segundo arreglo: ");
        do{
            for(int i = 0; i < b.length; i++) {
                System.out.print("Valor " + (i + 1) + ": ");
                b[i] = entrada.nextInt();
            }
            //comprobar si está ordenado
            for(int i = 0; i < 9; i++){
                if(b[i] < b[i+1])
                    creciente = true;
                if(b[i] > b[i+1])
                    creciente = false;
                break;
            }
            if(creciente == false)
                System.out.println("\nEl arreglo está desordenado, vuelva a digitar...");
        }
        while (creciente == false);

        int itei = 0;
        int itej = 0;
        int itek = 0;

        while(itei < 10 && itej < 10){
            if(a[itei] < b[itej]){
                c[itek] = a[itei];
                itei++;
            }
            else{
                c[itek] = b[itej];
                itej++;
            }
            itek++;
        }
        //Si se sale del ciclo while, se copió algún conjunto por completo
        if(itei == 10){
            while(itej < 10){
                c[itek] = b[itej];
                itej++;
                itek++;
            }
        }
        else{
            while(itei < 10){
                c[itek] = a[itei];
                itei++;
                itek++;
            }
        }

        System.out.println("\nDatos de la tabla actual arreglo c");
        for(int e:c)
            System.out.print(e + " ");

    }
}
