import org.junit.Assert;
import org.junit.Test;
public class RectangleTest {

    @Test
    public void should_calculate_rectangle_area()
    {
        Rectangle rectangle = new Rectangle();
        Assert.assertSame(8, rectangle.calculateRectangleArea(2, 4));
        Assert.assertSame(20, rectangle.calculateRectangleArea(5, 4));
        Assert.assertSame(18, rectangle.calculateRectangleArea(3, 6));
    }

    @Test
    public void should_calculate_rectangle_perimeter()
    {
        Rectangle rectangle = new Rectangle();
        Assert.assertSame(10, rectangle.calculateRectanglePerimeter(2, 3));
        Assert.assertSame(18, rectangle.calculateRectanglePerimeter(5, 4));
        Assert.assertSame(20, rectangle.calculateRectanglePerimeter(4, 6));
    }
}

