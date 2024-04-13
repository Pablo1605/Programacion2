package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro n = new Novela("Cien años de soledad", "Gabriel García Márquez", 1967, "Realismo mágico");
        Libro u = new Universitario("Introducción a la Inteligencia Artificial", "Stuart Russell, Peter Norvig", 1995, "Informática");
        Libro i = new Infantil("El principito", "Antoine de Saint-Exupéry", 1943, "El autor");

        biblioteca.agregarLibro(n);
        biblioteca.agregarLibro(u);
        biblioteca.agregarLibro(i);

        biblioteca.listarLibrosDisponibles();

        biblioteca.prestarLibro("Cien años de soledad");
        biblioteca.prestarLibro("El principito");

        biblioteca.devolverLibro("El principito");

        biblioteca.listarLibrosDisponibles();
    }
}
