package Agregacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Empleado 1","Cargo 1");
        Empleado e2 = new Empleado("Empleado 2","Cargo 2");
        Empleado e3 = new Empleado("Empleado 3","Cargo 3");
        Departamento d1 = new Departamento("Departamento A",Arrays.asList(e1,e2));
        Departamento d2 = new Departamento("Departamento B",Arrays.asList(e3));

        System.out.println("Empleados del "+ d1.getNombre()+ ":");
        for (Empleado empleado : d1.getEmpleados()){
            System.out.println("- "+ empleado.getNombre()+ ", Cargo "+ empleado.getCargo());
        }

        System.out.println("Empleados del "+ d2.getNombre()+ ":");
        for (Empleado empleado : d1.getEmpleados()){
            System.out.println("- "+ empleado.getNombre()+ ", Cargo "+ empleado.getCargo());
        }
    }
}
