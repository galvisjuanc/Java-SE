package Arrays;

import java.util.Scanner;

/**
 * @author galvi
 * Ejercicio 16: Queremos desarrollar una aplicaión que nos ayude a gestionar las notas de un centro educativo.
 *  Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre de
 *  un grupo. Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media del alumno que se encuentra
 *  en la posición N (N se lee por teclado
 */
public class Example_16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float primer[], segundo[], tercer[];
        float sumarPrimer=0, sumarSegundo= 0, sumarTercer = 0;
        float promedioPrimer, promedioSegundo, promedioTercer, sumaAlumno, promedioAlumno;
        int posicion;

        primer = new float[5];
        segundo = new float[5];
        tercer = new float[5];

        System.out.println("Digite las notas del primer trimestre: ");
        for(int i = 0; i < 5; i++) {
            System.out.print("Alumno [" + (i + 1) + "]: ");
            primer[i] = entrada.nextFloat();

            sumarPrimer += primer[i];
        }

        System.out.println("Digite las notas del segundo trimestre: ");
        for(int i = 0; i < 5; i++) {
            System.out.print("Alumno [" + (i + 1) + "]: ");
            segundo[i] = entrada.nextFloat();

            sumarSegundo += segundo[i];
        }

        System.out.println("Digite las notas del tercer trimestre: ");
        for(int i = 0; i < 5; i++) {
            System.out.print("Alumno [" + (i + 1) + "]: ");
            tercer[i] = entrada.nextFloat();

            sumarTercer += tercer[i];
        }

        promedioPrimer = sumarPrimer/5;
        promedioSegundo = sumarSegundo/5;
        promedioTercer = sumarTercer/5;
        System.out.println("Las notas en promedio para cada trimestre están así: ");
        System.out.println("Primer trimestre: "+promedioPrimer);
        System.out.println("Segundo trimestre: "+promedioSegundo);
        System.out.println("Tercer trimestre: "+promedioTercer);

        //Pedir la posición del alumno N para sacar su promedio
        do{
            System.out.println("\nDigite la posición del alumno (0-4) para sacar el promedio");
            posicion = entrada.nextInt();
        }
        while(posicion < 0 || posicion > 4);

        sumaAlumno = primer[posicion] + segundo[posicion] + tercer[posicion];
        promedioAlumno = sumaAlumno/3;
        System.out.println("El promedio del alumno elegido es de: "+promedioAlumno);

    }
}
