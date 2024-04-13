package Ejercicio2;

class Libro implements Prestable {
    private String titulo;
    private String autor;
    private int añoDePublicacion;
    private boolean prestado;

    public Libro(String titulo, String autor, int añoDePublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoDePublicacion = añoDePublicacion;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
        } else {
            System.out.println("El libro \"" + titulo + "\" ya está prestado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
        } else {
            System.out.println("El libro \"" + titulo + "\" no estaba prestado.");
        }
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año de publicación: " + añoDePublicacion;
    }
}
