package Ejercicio1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de cada clase
        Profesor profesor = new Profesor(12345678, "Juan Perez", "Matemáticas");
        Grupo grupo1 = new Grupo("A", '1');
        Grupo grupo2 = new Grupo("B", '1');
        Alumno alumno1 = new Alumno(98765432, "Pablo Ramírez", grupo1);
        Alumno alumno2 = new Alumno(54321678, "Carlos Rodriguez", grupo2);
        grupo1.agregarAlumno(alumno1);
        grupo2.agregarAlumno(alumno2);
        Asignatura asignatura1 = new Asignatura(101, "08:00", "Matemáticas", profesor, grupo1);
        Asignatura asignatura2 = new Asignatura(102, "09:00", "Física", profesor, grupo2);

        System.out.println("Aula de la 3ra. asignatura: " + asignatura2.getAula());

        System.out.println("Asignaturas que imparte el profesor:");
        System.out.println(asignatura1.getNombre());
        System.out.println(asignatura2.getNombre());

        System.out.println("Alumnos del grupo que recibe la asignatura:");
        for (Alumno alumno : grupo2.getAlumnos()) {
            System.out.println("Nombre: " + alumno.getNombre() + ", DNI: " + alumno.getDni());
        }

        System.out.println("Asignaturas recibidas por el 1er grupo al que pertenece el alumno:");
        for (Asignatura asignatura : asignaturasDelPrimerGrupo(alumno1)) {
            System.out.println(asignatura.getNombre());
        }

        String nombreAsignatura = "Matemáticas";
        Profesor profesorDeAsignatura = profesorDeAsignatura(nombreAsignatura, asignatura1, asignatura2);
        if (profesorDeAsignatura != null) {
            System.out.println("El profesor que imparte " + nombreAsignatura + " es: " + profesorDeAsignatura.getNombre());
        } else {
            System.out.println("No se encontró el profesor que imparte " + nombreAsignatura);
        }

        System.out.println("Alumnos inscriptos en el Grupo de la 2da. Asignatura:");
        for (Alumno alumno : grupo2.getAlumnos()) {
            System.out.println(alumno.getNombre());
        }
    }

    private static List<Asignatura> asignaturasDelPrimerGrupo(Alumno alumno) {
        return alumno.getGrupo().getAsignaturas();
    }

    private static Profesor profesorDeAsignatura(String nombreAsignatura, Asignatura... asignaturas) {
        for (Asignatura asignatura : asignaturas) {
            if (asignatura.getNombre().equals(nombreAsignatura)) {
                return asignatura.getProfesor();
            }
        }
        return null;
    }

}
