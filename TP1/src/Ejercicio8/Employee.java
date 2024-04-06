package Ejercicio8;

public class Employee {
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " está trabajando.");
    }

    public void showInformation() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Salario: $" + salary);
    }
}
