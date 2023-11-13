package ShapeCalculator;

public class Square implements Shape{
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    private int side;
    public Square(int side) {
        this.side = side;
    }


    @Override
    public int calculateArea() {
        return side * side;
    }
}
