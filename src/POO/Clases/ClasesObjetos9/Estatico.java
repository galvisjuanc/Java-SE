package POO.Clases.ClasesObjetos9;

public class Estatico {
    private String frase = "Primera Frase";
    private static String frase1 = "Tercera Frase";

    public static int sumar(int n1, int n2){
        int suma = n1 + n2;
        return suma;
    }

    public static void main(String[] args) {

        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();

        ob2.frase = "Segunda Frase";

        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
    }
}
