package MedicalAppointments;

public class Doctor {
    static int id = 0;
    String name;

    String email;
    String speciality;

    Doctor() {
        System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name, String speciality) {
        System.out.println("Name's Doctor: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName() {
        System.out.println("Mostrando el nombre: " + name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }
}
