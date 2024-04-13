package Ejercicio1;
import java.util.ArrayList;
import java.util.List;

public class TiendaMascotas {
    private List<Animal> animales;

    public TiendaMascotas() {
        this.animales = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animales.add(animal);
        System.out.println(animal.getNombre() + " ha sido agregado a la tienda.");
    }

    public void venderAnimal(String nombre) {
        for (Animal animal : animales) {
            if (animal.getNombre().equals(nombre)) {
                animales.remove(animal);
                System.out.println(animal.getNombre() + " ha sido vendido.");
                return;
            }
        }
        System.out.println("No se encontró ningún animal con el nombre " + nombre);
    }

    public void alimentarAnimal(String nombre) {
        for (Animal animal : animales) {
            if (animal.getNombre().equals(nombre)) {
                animal.alimentar("comida para " + animal.getTipoAnimal());
                return;
            }
        }
        System.out.println("No se encontró ningún animal con el nombre " + nombre);
    }

    public void listarAnimales() {
        if (animales.isEmpty()) {
            System.out.println("No hay animales en la tienda.");
        } else {
            System.out.println("Animales en la tienda:");
            for (Animal animal : animales) {
                System.out.println(animal);
            }
        }
    }
}
