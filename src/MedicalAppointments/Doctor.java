package MedicalAppointments;

public class Doctor {
    static int id = 0;
    String name;
    String speciality;

    Doctor() {
        System.out.println("Construyendo el Objeto Doctor");
        id++;
    }

    Doctor(String name) {
        System.out.println("Name's Doctor: " + name);
    }

    //Comportamientos
    public void showName() {
        System.out.println("Mostrando el nombre: " + name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }
}
