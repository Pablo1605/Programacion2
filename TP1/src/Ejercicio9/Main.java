package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println("Círculo:");
        System.out.println("Área: " + c1.calculateArea());
        System.out.println("Perímetro: " + c1.calculatePerimeter());
        System.out.println();

        Rectangle r1 = new Rectangle(4, 6);
        System.out.println("Rectángulo:");
        System.out.println("Área: " + r1.calculateArea());
        System.out.println("Perímetro: " + r1.calculatePerimeter());
    }
}
