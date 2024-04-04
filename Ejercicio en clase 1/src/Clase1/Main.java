package Clase1;

public class Main {
    public static void main(String[] args) {
        Square cu1 = new Square(5);
        Circle ci1 = new Circle(3);
        System.out.println("El área del cuadrado es: "+ cu1.area());
        System.out.println("El área del circulo es: "+ ci1.area());
        cu1.draw();
        cu1.rotate();
        ci1.draw();
    }
}
