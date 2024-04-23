package Ejercicio1;

import java.util.Map;

class Alumno extends Persona {
    private Grupo grupo;

    public Alumno(int dni, String nombre, Grupo grupo) {
        super(dni, nombre);
        this.grupo = grupo;
    }

    public Grupo getGrupo() {
        return grupo;
    }
}
