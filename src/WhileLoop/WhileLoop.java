package WhileLoop;

public class WhileLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {

        turnOnOffLight();
        int i = 0;
        while(isTurnOnLight && i <= 20) {
            printSOS();
            i++;
        }
    }

    public static void printSOS() {
        System.out.println("...___...");
    }

    public static boolean turnOnOffLight() {
        isTurnOnLight = (isTurnOnLight) ? false : true;
        return isTurnOnLight;
    }
}
