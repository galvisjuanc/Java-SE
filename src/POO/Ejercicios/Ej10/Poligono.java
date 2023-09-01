package POO.Ejercicios.Ej10;

public abstract class Poligono {

        protected int numeroLados;

        public Poligono(int numeroLados) {
            this.numeroLados = numeroLados;
        }

        public int getNumeroLados() {
            return numeroLados;
        }

        public void setNumeroLados(int numeroLados) {
            this.numeroLados = numeroLados;
        }

        @Override
        public String toString() {
            return "Poligono {" +
                    "Número Lados=" + numeroLados +
                    '}';
        }

        public abstract double area();

}
