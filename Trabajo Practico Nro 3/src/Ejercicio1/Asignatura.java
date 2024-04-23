package Ejercicio1;
import java.util.ArrayList;
import java.util.List;

class Asignatura {
    private int aula;
    private String hora;
    private String nombre;
    private Profesor profesor;
    private Grupo grupo;

    public Asignatura(int aula, String hora, String nombre, Profesor profesor, Grupo grupo) {
        this.aula = aula;
        this.hora = hora;
        this.nombre = nombre;
        this.profesor = profesor;
        this.grupo = grupo;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}
