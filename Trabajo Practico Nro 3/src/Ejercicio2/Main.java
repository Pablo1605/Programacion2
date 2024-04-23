package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de la clase Empleado
        Empleado empleado1 = new Empleado("Pablo");
        Empleado empleado2 = new Empleado("Facundo");

        empleado1.asignarSupervisor(empleado2);

        System.out.println("El supervisor de " + empleado1.nombre + " es: " + empleado1.obtenerNombreSupervisor());
    }
}
