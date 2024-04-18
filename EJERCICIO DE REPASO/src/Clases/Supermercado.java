package Clases;
import java.util.ArrayList;
import java.util.List;

class Supermercado {
    private List<Producto> inventario;

    public Supermercado() {
        this.inventario = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public Producto buscarProducto(String nombreProducto) {
        for (Producto producto : inventario) {
            if (producto.getNombre().equals(nombreProducto)) {
                return producto;
            }
        }
        return null;
    }

    public void realizarCompra(Cliente cliente) {
        for (Producto producto : cliente.getCarrito()) {
            Producto productoEnInventario = buscarProducto(producto.getNombre());
            if (productoEnInventario != null && productoEnInventario.getCantidadStock() > 0) {
                productoEnInventario.setCantidadStock(productoEnInventario.getCantidadStock() - 1);
            }
        }
        cliente.getCarrito().clear();
    }

    public void mostrarInventario() {
        System.out.println("Inventario del supermercado:");
        for (Producto producto : inventario) {
            producto.imprimirInformacion();
            System.out.println();
        }
    }
}
