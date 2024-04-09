package Agregacion;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre, List<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
}
