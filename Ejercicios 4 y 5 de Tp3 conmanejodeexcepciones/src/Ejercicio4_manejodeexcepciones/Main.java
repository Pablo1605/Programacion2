package Ejercicio4_manejodeexcepciones;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Alumno> listaAlumnos = new ArrayList<>();
        boolean continuar = true;
        while (continuar) {
            try {
                System.out.println("\n1. Agregar alumno");
                System.out.println("2. Mostrar lista de alumnos");
                System.out.println("3. Calcular y mostrar la media de notas");
                System.out.println("4. Mostrar alumno con la nota más alta");
                System.out.println("5. Buscar alumno por nombre");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("\nIngrese el nombre del alumno: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese la edad del alumno: ");
                        int edad = scanner.nextInt();
                        System.out.print("Ingrese la nota del alumno: ");
                        double nota = scanner.nextDouble();
                        listaAlumnos.add(new Alumno(nombre, edad, nota));
                        System.out.println("Alumno agregado correctamente.");
                        break;
                    case 2:
                        if (listaAlumnos.isEmpty()) {
                            System.out.println("\nNo hay alumnos en la lista.");
                        } else {
                            System.out.println("\nLista de alumnos:");
                            for (Alumno alumno : listaAlumnos) {
                                System.out.println(alumno);
                            }
                        }
                        break;
                    case 3:
                        if (listaAlumnos.isEmpty()) {
                            System.out.println("\nNo hay alumnos en la lista para calcular la media de notas.");
                        } else {
                            double sumaNotas = 0;
                            for (Alumno alumno : listaAlumnos) {
                                sumaNotas += alumno.getNota();
                            }
                            double mediaNotas = sumaNotas / listaAlumnos.size();
                            System.out.println("\nLa media de notas de todos los alumnos es: " + mediaNotas);
                        }
                        break;
                    case 4:
                        if (listaAlumnos.isEmpty()) {
                            System.out.println("\nNo hay alumnos en la lista para mostrar la nota más alta.");
                        } else {
                            double notaMaxima = Double.MIN_VALUE;
                            Alumno alumnoNotaMaxima = null;
                            for (Alumno alumno : listaAlumnos) {
                                if (alumno.getNota() > notaMaxima) {
                                    notaMaxima = alumno.getNota();
                                    alumnoNotaMaxima = alumno;
                                }
                            }
                            System.out.println("\nEl alumno con la nota más alta es:");
                            System.out.println(alumnoNotaMaxima);
                        }
                        break;
                    case 5:
                        if (listaAlumnos.isEmpty()) {
                            System.out.println("\nNo hay alumnos en la lista para buscar.");
                        } else {
                            System.out.print("\nIngrese el nombre del alumno a buscar: ");
                            String nombreBuscar = scanner.nextLine();
                            boolean encontrado = false;
                            for (Alumno alumno : listaAlumnos) {
                                if (alumno.getNombre().equalsIgnoreCase(nombreBuscar)) {
                                    System.out.println("Alumno encontrado:");
                                    System.out.println(alumno);
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("No se encontró ningún alumno con ese nombre.");
                            }
                        }
                        break;
                    case 6:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Por favor, ingrese un valor válido.");
                scanner.nextLine();
            }
        }
    }
}