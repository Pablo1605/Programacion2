package Ejercicio5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDeTareas listaDeTareas = new ListaDeTareas();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n1. Agregar tarea");
            System.out.println("2. Mostrar todas las tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese la descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Ingrese la prioridad de la tarea (mayor número indica mayor prioridad): ");
                    int prioridad = scanner.nextInt();
                    listaDeTareas.agregarTarea(new Tarea(descripcion, prioridad));
                    System.out.println("Tarea agregada correctamente.");
                    break;
                case 2:
                    System.out.println("\nTodas las tareas en orden de prioridad descendente:");
                    for (Tarea tarea : listaDeTareas) {
                        System.out.println("Descripción: " + tarea.getDescripcion() + ", Prioridad: " + tarea.getPrioridad());
                    }
                    break;
                case 3:
                    System.out.print("\nIngrese la descripción de la tarea a eliminar: ");
                    String descripcionEliminar = scanner.nextLine();
                    listaDeTareas.eliminarTarea(descripcionEliminar);
                    System.out.println("Tarea eliminada correctamente.");
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
            }
        }

        scanner.close();
    }
}
