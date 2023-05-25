package MedicalAppointments;

import java.util.Date;

import static MedicalAppointments.ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Juan Galvis", "Ginecología");
        myDoctor.addAvailableAppointment(new Date(), "10 am");
        myDoctor.addAvailableAppointment(new Date(), "12 am");
        myDoctor.addAvailableAppointment(new Date(), "2 pm");
        myDoctor.addAvailableAppointment(new Date(), "4 pm");

        System.out.println(myDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        /* myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor.id++;

        Doctor myDoctor1 = new Doctor("Dougleidy Martinez", "Cardiologa");

        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.showId();
        System.out.println(Doctor.id);

        System.out.println("\nName of the new doctor: " + myDoctor1.getName());
        System.out.println("\nSpeciality: " + myDoctor1.getSpeciality());

        Patient patient = new Patient("Patricio", "canariomalvado@gmail.com");
        System.out.println(patient.getName());
        System.out.println(patient.getEmail());

        showMenu();*/
    }


}
