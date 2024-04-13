package Ejercicio1;
import java.util.ArrayList;
import java.util.List;

class Animal {
    private String nombre;
    private int edad;
    private String tipoAnimal;
    private double precio;

    public Animal(String nombre, int edad, String tipoAnimal, double precio) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal = tipoAnimal;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void alimentar(String comida) {
        System.out.println(nombre + " está comiendo " + comida);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Tipo: " + tipoAnimal + ", Precio: " + precio;
    }
}

