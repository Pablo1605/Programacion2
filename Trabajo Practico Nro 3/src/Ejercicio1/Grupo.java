package Ejercicio1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Grupo {
    private String curso;
    private char letra;
    private List<Alumno> alumnos;

    public Grupo(String curso, char letra) {
        this.curso = curso;
        this.letra = letra;
        this.alumnos = new ArrayList<>();
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }
}
