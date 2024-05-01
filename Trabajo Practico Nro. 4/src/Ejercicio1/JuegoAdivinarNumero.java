package Ejercicio1;
import java.util.Scanner;

public class JuegoAdivinarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAleatorio = (int) (Math.random() * 100) + 1;
        int intentos = 0;

        System.out.println("Bienvenido al juego de adivinar un número entre 1 y 100.");
        System.out.println("¡Adivina el número!");

        while (true) {
            System.out.print("Introduce tu intento: ");
            try {
                int intento = Integer.parseInt(sc.nextLine());
                intentos++;

                if (intento == numAleatorio) {
                    System.out.println("¡Felicidades! ¡Has adivinado el número en " + intentos + " intentos!");
                    break;
                } else if (intento < numAleatorio) {
                    System.out.println("El número a adivinar es mayor.");
                } else {
                    System.out.println("El número a adivinar es menor.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un número válido. Por favor, introduce un número.");
                intentos++;
            }
        }

        sc.close();
    }
}
