package POO.Ejercicios.Ej10;

public class Triangulo extends Poligono {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public String toString() {
        return "Triangulo: {" +
                "Número Lados = " + numeroLados +
                ", lado1 = " + lado1 +
                ", lado2 = " + lado2 +
                ", lado3 = " + lado3 +
                '}';
    }

    @Override
    public double area() {
        /* Fórmula de Herón: a, b y c.        * p = a + b + c / 2.        * A = sqrt((p * (p-a)*(p-b)*(p-c)) */
        double perimetroTriangulo;
        double areaTriangulo;
        perimetroTriangulo = (getLado1() + getLado2() + getLado3())/2;
        areaTriangulo = Math.sqrt(perimetroTriangulo *
                (perimetroTriangulo-getLado1())*
                (perimetroTriangulo-getLado2())*
                (perimetroTriangulo-getLado3()));
        return areaTriangulo;
    }
}
