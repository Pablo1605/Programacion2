package Ejercicio10;

public class Novel extends Book{
    private String type;

    public Novel(String title, String author, double price) {
        super(title, author, price);
        this.type = type;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Tipo: " + type);
    }
}
