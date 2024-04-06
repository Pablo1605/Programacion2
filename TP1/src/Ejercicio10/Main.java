package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        textBook lb1 = new textBook("Algebra Lineal", "Juan Perez", 1500,"Matemática");
        lb1.setPrice(50);
        lb1.printInformation();
        System.out.println();

        bookOne lu1 = new bookOne("Física I", "Luisa Gómez", 2000, "Física", "Facultad de Ciencias");
        lu1.setPrice(70);
        lu1.printInformation();
        System.out.println();

        Novel n1 = new Novel("Cien años de soledad", "Gabriel García Márquez", 1200);
        n1.setPrice(20);
        n1.printInformation();
    }
}
