package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("Juan", 40, 5000, "Recursos Humanos");
        m1.showInformation();
        m1.organizeActivities();
        m1.work();
        System.out.println();

        Worker w1 = new Worker("María", 25, 3000, "Producción");
        w1.showInformation();
        w1.produce();
        w1.work();
    }
}
