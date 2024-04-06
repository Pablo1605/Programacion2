package Ejercicio8;

public class Worker extends Employee{
    private String area;

    public Worker(String name, int age, double salary, String area) {
        super(name, age, salary);
        this.area = area;
    }

    public void produce() {
        System.out.println(name + " está produciendo en el área de " + area);
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Área: " + area);
    }
}
