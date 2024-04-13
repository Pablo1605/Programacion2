package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        TiendaMascotas tienda = new TiendaMascotas();

        Animal p = new Perro("Tomy", 5, "Labrador", true, 100);
        Animal g = new Gato("Kitie", 3, "Siames", true, 80);
        Animal a = new Ave("Lorenzo", 1, "Loro", true, 50);
        Animal pe = new Pez("Nemo", 2, "Pez payaso", 20);

        tienda.addAnimal(p);
        tienda.addAnimal(g);
        tienda.addAnimal(a);
        tienda.addAnimal(pe);

        tienda.listarAnimales();

        tienda.alimentarAnimal("Tomy");
        tienda.venderAnimal("Kitie");

        tienda.listarAnimales();
    }
}
