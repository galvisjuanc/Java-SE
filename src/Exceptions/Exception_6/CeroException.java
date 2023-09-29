package Exceptions.Exception_6;

public class CeroException extends Exception {

    public CeroException(){
        super("Se ha introducido el número 0 y eso ha causado un error");
    }
}
