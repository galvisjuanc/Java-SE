package DataTypes;

public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;
        long nL = 12345678901L;

        double nD = 123.456;
        float nF = 1234.567F;

        var salary = 1000;          // Int
        var pension = salary * 0.03;            //double
        var totalSalary = salary - pension;
        var employeeName = "Juan Camilo";

        System.out.println("Entero Integer: " + n);
        System.out.println("Entero Long: " + nL);

        System.out.println("Decimal Double: " + nD);
        System.out.println("Decimal Flotante: " + nF);

        System.out.println("Initial Salary is: " + salary + " and its type is: " + employeeName);
        System.out.println("Pension is: " + pension);
        System.out.println("Total salary is: " + totalSalary);
    }
}
