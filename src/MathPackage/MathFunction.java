package MathPackage;

import java.util.Scanner;

public class MathFunction {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio;
        System.out.print("Digita el area del circulo o esfera: ");
        radio = entrada.nextDouble();
        System.out.println("El área si es un circulo es: " + circleArea(radio) + " cm2.");
        System.out.println("El área si es una esfera es: " + sphereArea(radio) + " cm2.");
        System.out.println("El volumen si es una esfera es: " + sphereVolumen(radio) + " cm3.");
        System.out.println("Pesos mexicanos a dolares: " + convertToDollar(200, "MXN"));
        System.out.println("Pesos colombianos a dolares: " + convertToDollar(200000, "COP"));

    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r) {
        return (4 * Math.PI * Math.pow(r,2));
    }

    public static double sphereVolumen(double r) {
        return ((4 * Math.PI * Math.pow(3,3)) / 3);
    }

    /**
     * Descripción general de nuestra función.
     *
     * @param quantity Descripción del parámetro quantity.
     * @param currency Descripción del parámetro currency (MXN o COP).
     * @return Descripción del valor que devolvemos en esta función.
     * */

    public static double convertToDollar(double quantity, String currency){
        switch (currency) {
            case "MXN" -> quantity = quantity * 0.052;
            case "COP" -> quantity = quantity * 0.00031;
        }
        return quantity;
    }
}
