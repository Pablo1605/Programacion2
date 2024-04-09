package AsociacionBidireccional;
import java.util.ArrayList;
import java.util.List;
public class Libro {
    private String titulo;
    private List<Persona> poseedores;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.poseedores = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Persona> getPoseedores() {
        return poseedores;
    }

    public void agregarPoseedor(Persona persona) {
        poseedores.add(persona);
    }
}
