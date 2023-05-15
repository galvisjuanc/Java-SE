package NamingVariables;

public class NamingVariables {
    public static void main(String[] args) {
        int cellphone = 123;
        int cellPhone= 90987;
        System.out.println(cellphone);
        System.out.println(cellPhone);

        String $countryName = "Colombia";
        String _backgroundColor = "Red";

        String currency$ = "COP";
        String background_color = "Black";

        System.out.println("País: " + $countryName + " y su moneda es: " + currency$);
        System.out.println("Colores de fondo: " + _backgroundColor + " y " + background_color);

        //Lower Camel Case
        String fullName = "Juan Camilo Galvis Cuéllar";
        int sizeInCentimeters = 180;
        System.out.println("Nombre: " + fullName + " y su tamaño en centimetros es: " + sizeInCentimeters);
    }
}
