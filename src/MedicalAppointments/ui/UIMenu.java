package MedicalAppointments.ui;

import MedicalAppointments.model.Doctor;
import MedicalAppointments.model.Patient;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static Doctor doctorLogged;
    public static Patient patientLogged;
    public static void showMenu() {
        int response = 0;
        do {
            System.out.println("Welcome to My Appointments");
            System.out.println("Selecciona la opción deseada...");
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            System.out.print("\nSeleccione la opción deseada --> ");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch(response){
                case 1 -> {
                    System.out.println("Welcome Doc!");
                    response = 0;
                    authUser(1);
                }
                case 2 -> {
                    response = 0;
                    authUser(2);
                }
                case 0 -> System.out.println("Thanks for visiting us!");
                default -> System.out.println("You must write a valid option!! Try again :) ...");
            }
        }
        while (response != 0);
    }

    private static void authUser(int userType) {
        //userType = 1 -> Doctor
        //userType = 2 -> Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martínez", "alejandro@mail.com"));
        doctors.add(new Doctor("Karen Sosa", "karensosa@mail.com"));
        doctors.add(new Doctor("Rocio Gomez", "rocio@mail.com"));
        doctors.add(new Doctor("Juan Manuel Galvis", "jmanuel@mail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anahí Salgado", "anahi@mail.com"));
        patients.add(new Patient("Roberto Bolaños", "bolanios@mail.com"));
        patients.add(new Patient("Carlos Sanchez", "csanchez@mail.com"));
        patients.add(new Patient("Geraldine Sierra", "gsierradine@mail.com"));

        boolean emailCorrect = false;
        do{
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1) {
                for (Doctor d: doctors){
                    if(d.getEmail().equals(email)) {
                        emailCorrect = true;
                        // Obtener el usuario logueado
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            if (userType == 2) {
                for (Patient p: patients){
                    if(p.getEmail().equals(email)) {
                        emailCorrect = true;
                        // Obtener el usuario registrado
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        }
        while(!emailCorrect);
    }

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient Menu - New Hospital");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            System.out.print("\nSeleccione la opción deseada --> ");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1 -> {
                    System.out.println("The appointment was booked");
                    for (String month: MONTHS) {
                        System.out.println(month);
                    }
                }
                case 2 -> System.out.println("Here you have your appointments. You're welcome!");
                case 0 -> showMenu();
                default -> System.out.println("Wrong choice. Try again!");
            }
        } while (response != 0);

    }
}
