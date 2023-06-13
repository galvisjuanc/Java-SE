package Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] numeros = new int[3];  //definir el array unidimensional. Será de 3
        numeros[0] = 7;              //asignar manualmente los valores dentro del array
        numeros[1] = 10;              //asignar manualmente los valores dentro del array
        numeros[2] = 13;              //asignar manualmente los valores dentro del array
        //System.out.println(numeros[0]);        //para imprimir un valor, se usar System.out.Println
        for(int i = 0; i < 3; i++)       //es mejor imprimir los valores con un ciclo for. El iterador siempre debe ser igual a cero
        {
            System.out.println(numeros[i]);
        }
        System.out.println();

        int[] numeros1 = {5,7,9,10};        //segunda forma agregando los elementos del array directamente. Se agregan con llaves
        for(int i = 0; i < 4; i++)          //ciclo for para imprimir los valores
        {
            System.out.println(numeros1[i]);
        }

        System.out.println("****************");
        System.out.println("****************");

        for (int elementos:numeros1) {
            System.out.print("Valor: "+elementos+" ");

        }
    }

}
