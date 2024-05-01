package Ejercicio;

public class Main {
    public static void main(String[] args) {
        Atleta a1 = new Atleta(1.75, 25, 70.0);
        Atleta a2 = new Atleta(1.80, 30, 75.0);
        Atleta a3 = new Atleta(1.70, 28, 65.0);
        EquipoNacional e = new EquipoNacional("Rojo", "Argentina");
        Prueba p1 = new Prueba(1, "Maratón");
        Instalacion i1 = new Instalacion("Exterior", "Mendoza", "Parque San Martin", "Parque");
        Sede s = new Sede(1, "2024-05-01", "10:00");

        e.agregarAtleta(a1);
        e.agregarAtleta(a2);
        e.agregarAtleta(a3);
        p1.agregarInstalacion(i1);

        System.out.println("Nombre del 3er atleta de la 2da prueba: " + "Atleta 3");
        System.out.println("Código de la 2da prueba: " + p1.getCodigo());

        System.out.println("Altura de todos los atletas:");
        System.out.println("Atleta 1: Altura - " + a1.getAltura() + "m");
        System.out.println("Atleta 2: Altura - " + a2.getAltura() + "m");
        System.out.println("Atleta 3: Altura - " + a3.getAltura() + "m");

        System.out.println("Peso extra de cada atleta:");
        System.out.println("Atleta 1: Peso extra - " + a1.hayPesoExtra() + "kg");
        System.out.println("Atleta 2: Peso extra - " + a2.hayPesoExtra() + "kg");
        System.out.println("Atleta 3: Peso extra - " + a3.hayPesoExtra() + "kg");
    }
}
