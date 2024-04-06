package Ejercicio8;

public class Manager extends Employee{
    private String departament;

    public Manager(String name, int age, double salary, String departament) {
        super(name, age, salary);
        this.departament = departament;
    }

    public void organizeActivities() {
        System.out.println(name + " está organizando actividades en el departamento de " + departament);
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Departamento: " + departament);
    }
}
