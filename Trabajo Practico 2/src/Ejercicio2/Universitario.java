package Ejercicio2;

class Universitario extends Libro {
    private String carrera;

    public Universitario(String titulo, String autor, int añoDePublicacion, String carrera) {
        super(titulo, autor, añoDePublicacion);
        this.carrera = carrera;
    }
}
