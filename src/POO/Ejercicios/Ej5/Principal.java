package POO.Ejercicios.Ej5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int numeroAtleta, nAtletas, indiceRapido;
        float tiempoCarrera;

        System.out.print("Digite el número de atletas a participar: ");
        nAtletas = entrada.nextInt();

        //Objetos instanciados.
        Atleta atletas[] = new Atleta[nAtletas];

        for (int i = 0; i < atletas.length; i++) {

            System.out.println("\nDigite los datos del atleta "+(i+1)+": ");
            System.out.print("Introduzca el número del atleta: ");
            numeroAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Introduzca el nombre del atleta: ");
            nombre = entrada.nextLine();
            System.out.print("Introduzca el tiempo de carrera: ");
            tiempoCarrera = entrada.nextFloat();

            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);
        }

        indiceRapido = indiceAtletaRapido(atletas);
        System.out.println("\nEl atletas ganador es: ");
        System.out.println(atletas[indiceRapido].mostrarDatosGanador());
    }

    public static int indiceAtletaRapido(Atleta competidores[]){
        float tiempomenor;
        int indice = 0;

        tiempomenor = competidores[0].getTiempoCarrera();
        for (int i = 1; i < competidores.length; i++) {
            if(competidores[i].getTiempoCarrera() < tiempomenor){
                tiempomenor = competidores[i].getTiempoCarrera();
                indice = i;
            }

        }
        return indice;
    }
}
