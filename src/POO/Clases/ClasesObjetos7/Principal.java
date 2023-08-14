package POO.Clases.ClasesObjetos7;

public class Principal {
    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1();

//        objeto1.atributo1 = 15;
//        objeto1.atributo2 = 30;
        objeto1.setAtributo1(10);
        objeto1.setAtributo2(23);
        objeto1.setAtributo3(45);

        System.out.println("El atributo1 es: "+objeto1.getAtributo1());
        System.out.println("El atributo2 es: "+objeto1.getAtributo2());
        System.out.println("El atributo3 es: "+objeto1.getAtributo3());
    }
}
