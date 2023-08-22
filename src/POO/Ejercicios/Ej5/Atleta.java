package POO.Ejercicios.Ej5;

public class Atleta {
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;

    //Constructor
    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    //Métodos


    public int getNumeroAtleta() {
        return numeroAtleta;
    }

    public String getNombre() {
        return nombre;
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }

    public String mostrarDatosGanador(){
        return "Número Atleta: "+getNumeroAtleta()+"\nNombre: "+getNombre()+"\nTiempo Carrera: "+getTiempoCarrera();
    }
}
