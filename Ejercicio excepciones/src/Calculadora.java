import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1 = 0, numero2 = 0;
        char operacion;

        try {
            System.out.print("Ingrese el primer número: ");
            numero1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            numero2 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese solo números.");
            return;
        }

        System.out.print("Ingrese la operación (+, -, *, /): ");
        operacion = scanner.next().charAt(0);

        double resultado = 0;
        try {
            switch (operacion) {
                case '+':
                    resultado = numero1 + numero2;
                    break;
                case '-':
                    resultado = numero1 - numero2;
                    break;
                case '*':
                    resultado = numero1 * numero2;
                    break;
                case '/':
                    if (numero2 == 0) {
                        throw new ArithmeticException("Error: División por cero.");
                    }
                    resultado = numero1 / numero2;
                    break;
                default:
                    System.out.println("Operación no válida.");
                    return;
            }
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}