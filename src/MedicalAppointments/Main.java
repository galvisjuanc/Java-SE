package MedicalAppointments;

import MedicalAppointments.model.Doctor;
import MedicalAppointments.model.ISchedulable;
import MedicalAppointments.model.Patient;
import MedicalAppointments.model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Juan Galvis", "galvisjuanc@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "10 am");
        myDoctor.addAvailableAppointment(new Date(), "12 am");
        myDoctor.addAvailableAppointment(new Date(), "2 pm");
        myDoctor.addAvailableAppointment(new Date(), "4 pm");
        System.out.println(myDoctor.getAvailableAppointments());

        System.out.println(myDoctor);

        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        Patient patient0 = new Patient("Rafael Lima", "lima@hbp.org");
        System.out.println("");
        System.out.println(patient0);
        System.out.println("");

        User userM = new Doctor("María del Carmen Cuéllar", "mcuellar193@gmail.com");
        userM.showDataUser();

        User userPatient = new Patient("Melva Fernandez", "melvavisco@hotmail.com");
        userPatient.showDataUser();

        User userAnonym = new User("Alejandro Canario", "canaryale@yahoo.es") {
            @Override
            public void showDataUser() {
                System.out.println("\nName : " + this.getName());
                System.out.println("Departamento: Geriatría");
            }
        };

        userAnonym.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {
                System.out.println("Fecha: " + date);
                System.out.println("Tiempo: " + time);
            }
        };

        iSchedulable.schedule(new Date(), "19:00 pm");

        Day day = Day.TUESDAY;
        switch (day) {
            case MONDAY -> System.out.println("Mondays are good");
            case FRIDAY -> System.out.println("Fridays are so nice");
            case SATURDAY, SUNDAY -> System.out.println("It's weeekend");
            default -> System.out.println("Midweek are so-so");
        }

        System.out.println(Day.WEDNESDAY);
        System.out.println(Day.WEDNESDAY.getSpanish());
    }
}
