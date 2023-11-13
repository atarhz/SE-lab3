package ShapeCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {


    @Test
    public void testSetSide() {
        Square square = new Square(5);
        square.setSide(8);
        assertEquals(8, square.getSide());
    }

    @Test
    public void testGetSide() {
        Square square = new Square(5);
        assertEquals(5, square.getSide());
    }

    @Test
    public void testCalculateArea() {
        Square square = new Square(5);
        assertEquals(25, square.calculateArea());
    }


}
