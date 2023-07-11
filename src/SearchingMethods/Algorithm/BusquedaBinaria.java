package SearchingMethods.Algorithm;

import javax.swing.JOptionPane;
/**
 * @author galvi
 * Busqueda binaria: Necesita un arreglo ordenado ascendentemente
 * Se divide el arreglo a la mitad para buscar el valor
 */
public class BusquedaBinaria {
    public static void main(String[] args) {
        int arreglo[] = {1, 2, 3, 4, 5};
        int dato, inf, sup, mitad, i;
        boolean bandera = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el número a buscar"));

        inf = 0;
        sup = 5;
        i = 0;

        mitad = (inf + sup)/2;

        while(inf <= sup && i < 5){
            if(arreglo[mitad] == dato){
                bandera = true;
                break;
            }

            if(arreglo[mitad] > dato){
                sup = mitad;
                mitad = (inf + sup)/2;
            }

            if(arreglo[mitad] < dato){
                inf = mitad;
                mitad = (inf + sup)/2;
            }
            i++;
        }

        if(bandera){
            JOptionPane.showMessageDialog(null, "El número ha sido encontrado en la posición: "+mitad);
        }

        else{
            JOptionPane.showMessageDialog(null, "No se encontró el numero digitado en el arreglo");
        }
    }
}
