package Ejercicio3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> diasSemana = new ArrayList<>();
        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miércoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sábado");
        diasSemana.add("Domingo");

        diasSemana.add(4, "Jueves");
        System.out.println("Se ha insertado 'Jueves' en la posición 4.");

        System.out.println("Contenido de la posición 3: " + diasSemana.get(3));
        System.out.println("Contenido de la posición 4: " + diasSemana.get(4));

        System.out.println("Primer elemento de la lista: " + diasSemana.get(0));
        System.out.println("Último elemento de la lista: " + diasSemana.get(diasSemana.size() - 1));

        boolean eliminado = diasSemana.remove("Jueves");
        if (eliminado) {
            System.out.println("Se ha eliminado 'Jueves' de la lista.");
        } else {
            System.out.println("'Juernes' no estaba presente en la lista.");
        }

        System.out.println("Valores de la lista:");
        Iterator<String> iterator = diasSemana.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        boolean encontrado = false;
        for (String dia : diasSemana) {
            if (dia.equalsIgnoreCase("Lunes")) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Se ha encontrado 'Lunes' en la lista.");
        } else {
            System.out.println("'Lunes' no está presente en la lista.");
        }

        diasSemana.clear();
        System.out.println("Se han borrado todos los elementos de la lista.");
    }
}
