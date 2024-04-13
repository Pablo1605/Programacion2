package Ejercicio2;

class Infantil extends Libro {
    private String ilustrador;

    public Infantil(String titulo, String autor, int añoDePublicacion, String ilustrador) {
        super(titulo, autor, añoDePublicacion);
        this.ilustrador = ilustrador;
    }
}
