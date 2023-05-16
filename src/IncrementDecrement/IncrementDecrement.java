package IncrementDecrement;

public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        System.out.println("Vidas iniciales de Mario: " + lives);

        lives = lives - 1;
        System.out.println("Perdió una vida: " + lives);

        lives--;
        System.out.println("Perdió una vida: " + lives);

        lives++;
        System.out.println("Ganó una vida: " + lives);

        // Aplicación del postfijo
        int gift1 = 100 + lives++;
        System.out.println("Postfijo es: " + gift1 + " y sus vidas son: " + lives);

        // Aplicación del prefijo
        int gift = 100 + ++lives;
        System.out.println("Prefijo es: " + gift + " y sus vidas son: " + lives);

    }
}
