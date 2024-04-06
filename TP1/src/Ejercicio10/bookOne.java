package Ejercicio10;

public class bookOne extends textBook{
    private String faculty;

    public bookOne(String title, String author, double price, String course, String faculty) {
        super(title, author, price, course);
        this.faculty = faculty;
    }

    @Override
    public void printInformation() {
        System.out.println("Facultad: " + faculty);
    }
}
