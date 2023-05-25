package MedicalAppointments;

import static MedicalAppointments.ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandra Rodriguez";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor.id++;

        Doctor myDoctor1 = new Doctor("Dougleidy Martinez", "Cardiologa");

        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.showId();
        System.out.println(Doctor.id);

        System.out.println("\nName of the new doctor: " + myDoctor1.name);
        System.out.println("\nSpeciality: " + myDoctor1.speciality);

        Patient patient = new Patient("Patricio", "canariomalvado@gmail.com");
        System.out.println(patient.getName());
        System.out.println(patient.getEmail());

        showMenu();
    }


}
