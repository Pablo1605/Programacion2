package Ejercicio2;
import java.util.ArrayList;
import java.util.List;


class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido agregado a la biblioteca.");
    }

    public void listarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : libros) {
            if (!libro.estaPrestado()) {
                System.out.println(libro);
            }
        }
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("El libro \"" + titulo + "\" no está en la biblioteca.");
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                libro.devolver();
                return;
            }
        }
        System.out.println("El libro \"" + titulo + "\" no está en la biblioteca.");
    }
}
