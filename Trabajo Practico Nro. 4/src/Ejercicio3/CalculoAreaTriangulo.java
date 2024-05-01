package Ejercicio3;
import java.util.Scanner;

public class CalculoAreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = 0;
        double altura = 0;

        boolean baseValida = false;
        while (!baseValida) {
            try {
                System.out.print("Ingrese la base del triángulo: ");
                base = Double.parseDouble(scanner.nextLine());
                if (base <= 0) {
                    throw new IllegalArgumentException("La base debe ser un número positivo.");
                }
                baseValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido para la base.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        boolean alturaValida = false;
        while (!alturaValida) {
            try {
                System.out.print("Ingrese la altura del triángulo: ");
                altura = Double.parseDouble(scanner.nextLine());
                if (altura <= 0) {
                    throw new IllegalArgumentException("La altura debe ser un número positivo.");
                }
                alturaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido para la altura.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);

        scanner.close();
    }
}
