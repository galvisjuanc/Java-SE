package switchStatement;

public class switchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";
        switch (colorModeSelected){
            case "Light" -> System.out.println("Seleccionaste Light Mode");
            case "Night" -> System.out.println("Seleccionaste Night Mode");
            case "Blue Dark" -> System.out.println("Seleccionaste Blue Dark Mode");
            case "Dark" -> System.out.println("Seleccionaste Dark Mode");
        }
    }
}
