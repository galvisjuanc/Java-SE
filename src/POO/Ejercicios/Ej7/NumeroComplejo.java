package POO.Ejercicios.Ej7;

public class NumeroComplejo {
    private double a;       // real
    private double b;       //imaginaria

    public NumeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    /* Suma --> num1 = 3 + 4i, num2 = 2 + 5i, suma = 5 + 9i
     * NumeroComplejo (num1) = new NumeroComplejo(3,4) [3 + 4i] --> num1.calcularSuma(num2)
     */
    public NumeroComplejo calcularSuma(NumeroComplejo c){
        NumeroComplejo suma = new NumeroComplejo(a + c.getA(), b + c.getB());
        return suma;
    }

    /* num1 = 3 + 4i, num2 = 2 + 5i, mult = (3*2 - 4*5) + (3*5 + 4*2)i
     * NumeroComplejo (num1) = new NumeroComplejo(3,4) [3 + 4i] --> num1.calcularMultiplicacion(num2)
     */
    public NumeroComplejo calcularMultiplicacion(NumeroComplejo c){
        NumeroComplejo mult = new NumeroComplejo((a * c.getA() - b*c.getB()), (a * c.getB() + b * c.getA()));
        return mult;
    }

    // Comparar parte real y parte imaginaria
    public boolean comprobarIgualdad(NumeroComplejo c){
        boolean igualdad = false;
        if((a == c.getA()) && b == c.getB()){
            igualdad = true;
        }
        return igualdad;
    }

    /* num1 = 3 + 4i,      * entero = 2     * mult = 6 + 8i  */

    public NumeroComplejo multiplicarPorEntero(int x){
        NumeroComplejo multe = new NumeroComplejo(a*x, b*x);
        return multe;
    }
}
