import ShapeCalculator.Rectangle;
import ShapeCalculator.Shape;
import ShapeCalculator.Square;

public class main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3, 4);
        Shape square = new Square(3);
        System.out.println("The area of the rectangle  is : " + rectangle.calculateArea());
        System.out.println("The area of the square is : " + square.calculateArea());
    }
}