package POO.Ejercicios.Ej6;

public class Triangulo {
    private double base;
    private double lado;

    //Constructor
    public Triangulo(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    //Metodos Getters y Setters

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    //Método Perimetro, Área y MostrarDatos
    public double obtenerPerimetro(){
        double perimetro = 2*lado+base;
        return perimetro;
    }

    public double obtenerArea(){
        double area = (base*Math.sqrt((getLado()*getLado()) - ((getBase()*getBase())/4)))/2;
        return area;
    }

    public String mostrarDatos(){
        return "Base: "+getBase()+"\nLado: "+getLado()+"\nPerimetro: "+obtenerPerimetro()+"\nArea: "+obtenerArea()+"\n";
    }
}
