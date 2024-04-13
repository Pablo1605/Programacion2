package Ejercicio1;

public class Perro extends Animal{
    private String raza;
    private boolean vacunado;

    public Perro(String nombre, int edad, String raza, boolean vacunado, double precio) {
        super(nombre, edad, "Perro", precio);
        this.raza = raza;
        this.vacunado = vacunado;
    }
}
