package UpdateVariables;

public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        System.out.println("Salario inicial: " + salary);
        salary = salary + 200;
        System.out.println("Salario más bonificación: " + salary);

        salary = salary - 50;
        System.out.println("Salario menos la pensión: " + salary);
        salary = salary + (30*2) - 45;
        System.out.println("Salario más horas extra menos comida: " + salary);

    }
}
