package Composicion;

public class Main {
    public static void main(String[] args) {
        Casa c = new Casa(5,"Madera");

        System.out.println("Materiales de las puertas de la casa");
        for (Puerta puerta : c.getPuertas()){
            System.out.println("- "+ puerta.getMaterial());
        }
    }
}
