package Ejercicio1;

public class Pez extends Animal{
    private String tipo;
    private Double longitud;

    public Pez(String nombre, int edad, String tipo, double precio) {
        super(nombre, edad, tipo, precio);
        this.tipo = tipo;
    }
}
