package Ejercicio10;

public class textBook extends Book{
    private String course;


    public textBook(String title, String author, double price, String course) {
        super(title, author, price);
        this.course = course;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Curso: " + course);
    }
}
