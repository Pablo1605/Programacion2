package Clases;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Arroz", 2.5, 50);
        Producto p2 = new Producto("Leche", 1.0, 100);
        Producto p3 = new Producto("Pan", 0.75, 75);

        Supermercado supermercado = new Supermercado();

        supermercado.agregarProducto(p1);
        supermercado.agregarProducto(p2);
        supermercado.agregarProducto(p3);

        supermercado.mostrarInventario();

        Cliente c1 = new Cliente("Pablo", "Ramírez");

        c1.agregarProductoAlCarrito(p1);
        c1.agregarProductoAlCarrito(p2);
        c1.agregarProductoAlCarrito(p3);

        double totalCompra = c1.calcularTotalCompra();
        System.out.println("Total de la compra: " + totalCompra);

        supermercado.realizarCompra(c1);

        supermercado.mostrarInventario();
    }
}
