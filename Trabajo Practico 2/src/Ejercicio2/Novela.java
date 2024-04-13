package Ejercicio2;

class Novela extends Libro {
    private String genero;

    public Novela(String titulo, String autor, int añoDePublicacion, String genero) {
        super(titulo, autor, añoDePublicacion);
        this.genero = genero;
    }
}

