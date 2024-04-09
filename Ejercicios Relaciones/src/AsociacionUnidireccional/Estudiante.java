package AsociacionUnidireccional;

public class Estudiante {
    private String nombre;
    private Universidad universidadAsociada;

    public Estudiante(String nombre, Universidad universidadAsociada) {
        this.nombre = nombre;
        this.universidadAsociada = universidadAsociada;
    }

    public String getNombre() {
        return nombre;
    }

    public Universidad getUniversidadAsociada() {
        return universidadAsociada;
    }

    public void cambiarUniversidad(Universidad nuevaUniversidad){
        this.universidadAsociada = nuevaUniversidad;
    }
}
