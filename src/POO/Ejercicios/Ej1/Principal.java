package POO.Ejercicios.Ej1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float l1, l2;
        Cuadrilatero c1;
        System.out.print("Digite el valor del primer lado del cuadrilatero: ");
        l1 = entrada.nextFloat();
        System.out.print("Digite el valor del segundo lado del cuadrilatero: ");
        l2 = entrada.nextFloat();

        if(l1 != l2) {
            c1 = new Cuadrilatero(l1, l2);
        }
        else{
            c1 = new Cuadrilatero(l1);
        }

        System.out.println("El perimetro del cuadrilatero es: "+c1.getPerimetro());
        System.out.println("El área del cuadrilatero es: "+c1.getArea());

    }
}
