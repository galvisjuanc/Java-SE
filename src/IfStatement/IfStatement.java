package IfStatement;

public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSent = 3;

        if (isBluetoothEnabled){
            fileSent++;
            System.out.println("Envía el archivo: " + fileSent);
        }
        else {
            fileSent--;
            System.out.println("Quita un archivo: " + fileSent);
        }
    }
}
