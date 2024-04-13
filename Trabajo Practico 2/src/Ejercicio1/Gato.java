package Ejercicio1;

public class Gato extends Animal{
    private String raza;
    private boolean esterilizado;

    public Gato(String nombre, int edad, String raza, boolean esterilizado, double precio) {
        super(nombre, edad, "Gato", precio);
        this.raza = raza;
        this.esterilizado = esterilizado;
    }
}
