package AsociacionBidireccional;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Persona A");
        Persona persona2 = new Persona("Persona B");

        Libro libro1 = new Libro("Libro 1");
        Libro libro2 = new Libro("Libro 2");

        persona1.agregarLibro(libro1);
        persona1.agregarLibro(libro2);
        persona2.agregarLibro(libro2);

        System.out.println("Libros de " + persona1.getNombre() + ":");
        for (Libro libro : persona1.getLibrosPoseidos()) {
            System.out.println("- " + libro.getTitulo());
        }

        System.out.println("Libros de " + persona2.getNombre() + ":");
        for (Libro libro : persona2.getLibrosPoseidos()) {
            System.out.println("- " + libro.getTitulo());
        }

        System.out.println("Personas que poseen el libro " + libro2.getTitulo() + ":");
        for (Persona persona : libro2.getPoseedores()) {
            System.out.println("- " + persona.getNombre());
        }
    }
}
