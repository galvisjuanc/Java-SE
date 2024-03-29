package POO.Ejercicios.Ej8;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        String apellido;
        String dni;
        int numeroCuenta, nCuentas, opcion, indiceCuenta;
        double saldo, cantidad;
        Cuenta[] cuentas;
        Cliente cliente;

        System.out.print("Digite el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.print("Digite el apellido del cliente: ");
        apellido = entrada.nextLine();
        System.out.print("Digite el dni del cliente: ");
        dni = entrada.nextLine();

        System.out.print("Ahora, digite cuantas cuentas tiene ese cliente: ");
        nCuentas = entrada.nextInt();
        cuentas = new Cuenta[nCuentas];
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("\nDigite los datos para la cuenta "+(i+1)+": ");
            System.out.print("Digite el número de cuenta: ");
            numeroCuenta = entrada.nextInt();
            System.out.print("Digite el saldo de la cuenta: ");
            saldo = entrada.nextDouble();

            cuentas[i] = new Cuenta(numeroCuenta, saldo);
        }

        cliente = new Cliente(nombre, apellido, dni, cuentas);

        do{
            System.out.println("\t\n.:MENU:.");
            System.out.println("1. Ingresar dinero en la cuenta");
            System.out.println("2. Retirar dinero de la cuenta");
            System.out.println("3. Consultar saldo de la cuenta");
            System.out.println("4. Salir");
            System.out.print("Digite la opción del menú: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Digite el número de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

                    if(indiceCuenta == -1){
                        System.out.println("\nEl numero de cuenta ingresado no existe!");
                    }
                    else{
                        System.out.println("\nDigite la cantidad de dinero a ingresar: ");
                        cantidad = entrada.nextDouble();
                        cliente.ingresar_dinero(indiceCuenta, cantidad);
                        System.out.println("\nIngreso realizado correctamente");
                        System.out.println("Saldo disponible: "+cliente.consultar_saldo(indiceCuenta));
                    }
                    break;

                case 2:
                    System.out.print("Digite el número de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

                    if(indiceCuenta == -1){
                        System.out.println("\nEl numero de cuenta ingresado no existe!");
                    }
                    else{
                        System.out.println("\nDigite la cantidad de dinero a retirar: ");
                        cantidad = entrada.nextDouble();
                        if(cantidad > cliente.consultar_saldo(indiceCuenta)){
                            System.out.println("\nSaldo insuficiente");
                        }
                        else{
                            cliente.retirar_dinero(indiceCuenta, cantidad);
                            System.out.println("\nRetiro realizado correctamente");
                            System.out.println("Saldo disponible: "+cliente.consultar_saldo(indiceCuenta));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite el número de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

                    if(indiceCuenta == -1){
                        System.out.println("\nEl numero de cuenta ingresado no existe!");
                    }
                    else{
                        System.out.println("Saldo disponible: "+cliente.consultar_saldo(indiceCuenta));
                    }
                    break;

                case 4: break;

                default:
                    System.out.println("Error, se confundió de opción de menú!");
                    break;
            }
        }
        while(opcion != 4);
        System.out.println("Fin del programa");
    }

    public static int buscarNumeroCuenta(Cuenta[] cuentas, int n){
        int i = 0;
        int indice = 0;
        boolean encontrado = false;

        //Búsqueda secuencial
        while((i < cuentas.length) && (!encontrado)){
            if(cuentas[i].getNumeroCuenta() == n){
                encontrado = true;
                indice = i;
            }
            i++;
        }
        if(!encontrado){
            indice = -1;
        }
        return indice;
    }
}
