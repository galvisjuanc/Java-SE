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

        //Actualizando cadenas de texto
        String employeeName = "Camilo Galvis";
        employeeName = employeeName + " Cuéllar Calderon Salamanca Romero Díaz Muñoz Camelo García Novoa";
        System.out.println("Nombre completo sin primer nombre: " + employeeName);
        employeeName = "Juan " + employeeName;
        System.out.println("Nombre final y completo con el primer nombre: " + employeeName);
    }
}
