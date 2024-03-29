package POO.Ejercicios.Ej2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y;
        int direccion, movimiento;

        System.out.print("Digite la posicion en X del objeto: ");
        x = entrada.nextInt();
        System.out.print("Digite la posición en Y del objeto: ");
        y = entrada.nextInt();

        TableroCartesiano tc1 = new TableroCartesiano(x, y);

        do {
            System.out.print("Elija la posición hacia donde desea mover el objeto dentro del tablero: " +
                    "\n* Oprima 1 para mover hacia arriba" +
                    "\n* Oprima 2 para mover hacia abajo" +
                    "\n* Oprima 3 para mover hacia la derecha" +
                    "\n* Oprima 4 para mover hacia la izquierda" +
                    "\n* Oprima 0 para salir del programa\n" +
                    "\n*** Valor a elegir: ");

            direccion = entrada.nextInt();

            switch (direccion){
                case 1:
                    System.out.print("Digite un valor entero para saber cuantas posiciones desea mover el objeto hacia arriba: ");
                    movimiento = entrada.nextInt();
                    tc1.moverArriba(movimiento);
                    break;

                case 2:
                    System.out.print("Digite un valor entero para saber cuantas posiciones desea mover el objeto hacia abajo: ");
                    movimiento = entrada.nextInt();
                    tc1.moverAbajo(movimiento);
                    break;

                case 3:
                    System.out.print("Digite un valor entero para saber cuantas posiciones desea mover el objeto hacia la derecha: ");
                    movimiento = entrada.nextInt();
                    tc1.moverDerecha(movimiento);
                    break;

                case 4:
                    System.out.print("Digite un valor entero para saber cuantas posiciones desea mover el objeto hacia la izquierda: ");
                    movimiento = entrada.nextInt();
                    tc1.moverIzquierda(movimiento);
                    break;

                default:
                    break;
            }
        }
        while(direccion >= 1 && direccion <= 4);

        System.out.println("Posición final (X,Y) -> ("+tc1.getX()+","+tc1.getY()+")");

    }
}
