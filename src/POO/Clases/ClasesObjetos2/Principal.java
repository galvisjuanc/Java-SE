package POO.Clases.ClasesObjetos2;

public class Principal {
    public static void main(String[] args) {

        Operacion op = new Operacion();     // Objeto creado

        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();
    }
}
