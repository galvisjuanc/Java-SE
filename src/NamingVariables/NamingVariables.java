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

        System.out.println("País: " + $countryName + "y su moneda es :" + currency$);
        System.out.println("Colores de fondo: " + _backgroundColor + background_color);
    }
}
