package Ejercicio1;

public class Ave extends Animal{
    private String especie;
    private boolean habla;


    public Ave(String nombre, int edad, String especie, boolean habla, double precio) {
        super(nombre, edad, "Ave", precio);
        this.especie = especie;
        this.habla = habla;
    }
}
