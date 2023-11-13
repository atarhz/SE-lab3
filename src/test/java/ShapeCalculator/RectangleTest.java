package ShapeCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void testCalculateArea() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertEquals(12, rectangle.calculateArea());
    }

    @Test
    public void testGetWidth() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertEquals(3, rectangle.getWidth());
    }

    @Test
    public void testSetWidth() {
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.setWidth(5);
        assertEquals(5, rectangle.getWidth());
    }

    @Test
    public void testGetHeight() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertEquals(4, rectangle.getHeight());
    }

    @Test
    public void testSetHeight() {
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.setHeight(6);
        assertEquals(6, rectangle.getHeight());
    }
}
