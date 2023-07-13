package SearchingMethods.Algorithm;

import javax.swing.JOptionPane;

/**
 * @author galvi
 * Busqueda secuencial:
 * Suponiendo un arreglo [] = {3, 2, 5, 1, 4}; dato = 2;
 */
public class BusquedaSecuencial {
    public static void main(String[] args) {
        int arreglo[] = {4, 2, 3, 5, 1};
        int dato;
        boolean bandera = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el número a buscar en el arreglo: "));

        //Busqueda Secuencial
        int i = 0;
        while(i < 5 && bandera == false){
            if(arreglo[i] == dato) {
                bandera = true;
            }
            i++;
        }
        if(bandera == false){
            JOptionPane.showMessageDialog(null, "El número no se encuentra en el arreglo");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero se encontró en la posición: "+(i-1)+" del arreglo");
        }

    }
}
