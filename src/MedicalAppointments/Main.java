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

        Doctor myDoctor1 = new Doctor("Dougleidy Martinez");

        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.showId();
        System.out.println(Doctor.id);

        showMenu();
    }


}
