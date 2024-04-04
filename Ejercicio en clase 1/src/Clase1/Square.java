package Clase1;

public class Square implements Figure,Rotatable,Drawble{
    private float side;

    public Square(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public void draw() {

    }

    @Override
    public float area() {
        return 0;
    }

    @Override
    public void rotate() {

    }
}
