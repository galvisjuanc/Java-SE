package logicOperations;

public class LogicOperations {
    public static void main(String[] args) {
        int a = 8, b=5;

        //Operador de asignación
        System.out.println("a es igual a la variable b? -> " + (a == b));
        System.out.println("a es diferente a la variable b? -> " + (a != b));

        //Operador relacional
        System.out.println("a es mayor a la variable b? -> " + (a > b));
        System.out.println("a es menor a la variable b? -> " + (a < b));
        System.out.println("a es mayor o igual a b? -> " + (a >= b));
        System.out.println("a es menor o igual a b? -> " + (a <= b));

        if (a ==b){
            System.out.println("a es igual a b");
        } else if (a != b){
            System.out.println("a es diferente a b");
        } else if (a > b){
            System.out.println("a es mayor a b");
        } else if (a < b){
            System.out.println("a es menor a b");
        } else if (a >= b){
            System.out.println("a es mayor o igual a b");
        } else if (a <= b){
            System.out.println("a es menor o igual a b");
        }

    }
}
