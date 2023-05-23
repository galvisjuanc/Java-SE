package MedicalAppointments;

public class Doctor {
    int id;
    String name;
    String speciality;

    Doctor() {
        System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name) {
        System.out.println("Name's Doctor: " + name);
    }

    //Comportamientos
    public void showName() {
        System.out.println("Mostrando el nombre: " + name);
    }
}
