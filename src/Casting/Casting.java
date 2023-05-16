package Casting;

public class Casting {
    public static void main(String[] args) {
        //En un año ubiqué 30 perritos
        //Cuantos perritos ubiqué al mes

        double monthlyDogs = 30.0 / 12.0;
        System.out.println("Perritos ubicados: " + monthlyDogs);

        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println("Estimación de perritos ubicados: " + estimatedMonthlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println("Division: " + (double) a/b);

        double c = a/b;
        System.out.println("Division no correcta: " + c);

        char n = '1';
        int nI = n;
        System.out.println("Valor de la letra: " + nI);

        short nS = (short) n;
        System.out.println("Casting de un char a short: " + nS);
    }
}
