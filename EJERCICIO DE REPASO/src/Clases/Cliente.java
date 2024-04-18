package Clases;
import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nombre;
    private String apellido;
    private List<Producto> carrito;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrito = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void agregarProductoAlCarrito(Producto producto) {
        carrito.add(producto);
    }

    public double calcularTotalCompra() {
        double total = 0;
        for (Producto producto : carrito) {
            total += producto.getPrecio();
        }
        return total;
    }
}
