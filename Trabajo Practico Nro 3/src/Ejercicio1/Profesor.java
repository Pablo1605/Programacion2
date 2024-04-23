package Ejercicio1;
import java.util.ArrayList;
import java.util.List;

class Profesor extends Persona {
    private String departamento;

    public Profesor(int dni, String nombre, String departamento) {
        super(dni, nombre);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}
