package AsociacionBidireccional;
import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private List<Libro> librosPoseidos;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.librosPoseidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibrosPoseidos() {
        return librosPoseidos;
    }

    public void agregarLibro(Libro libro) {
        librosPoseidos.add(libro);
        libro.agregarPoseedor(this);
    }
}
