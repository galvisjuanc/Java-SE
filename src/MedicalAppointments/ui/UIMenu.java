package MedicalAppointments.ui;

import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
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
                case 1 -> System.out.println("Welcome Doc!");
                case 2 -> {response = 0; showPatientMenu();}
                case 0 -> System.out.println("Thanks for visiting us!");
                default -> System.out.println("You must write a valid option!! Try again :) ...");
            }
        }
        while (response != 0);
    }

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient Menu");
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
                case 2 -> System.out.println("Here you have your appointments");
                case 0 -> showMenu();
                default -> System.out.println("Wrong choice. Try again!");
            }
        } while (response != 0);

    }
}
