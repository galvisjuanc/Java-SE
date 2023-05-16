package MathematicsOperations;

public class MathematicsOperations {
    public static void main(String[] args) {
        double x = 4;
        double y = 9;
        double a = 3.4, b = 4.7;

        System.out.println("Valor del número euclidiano e: " + Math.E);
        System.out.println("Respuesta aproximada o redondeada hacia el número más alto: " + Math.ceil(a*b));
        System.out.println("Respuesta aproximada o redondeada hacia el número más bajo: " + Math.floor(a*b));
        System.out.println("Número elevado: " + Math.pow(x,y));
        System.out.println("Valor más grande entre dos números: " + Math.max(x,y));
        System.out.println("Raíz cuadrada: " + Math.sqrt(y));
        System.out.println("Area de un circulo pi * r2: " + Math.PI * Math.pow(x, 2));
        System.out.println("Area de una esfera 4*pi*r2: " + 4 * Math.PI * Math.pow(x,2));
        System.out.println("Volumen de una esfera (4*pi*r3) sobre 3: " + (4 * Math.PI * Math.pow(3,3)) / 3);


    }
}
