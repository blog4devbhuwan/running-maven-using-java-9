package mavenjava9.calc.rectangle;

import mavenjava9.calc.RectangleArea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Bhuwan Prasad Upadhyay
 */
class RectangleAreaTest {
    @Test
    void calculateAreaCorrectly() {
        Assertions.assertEquals(20, new RectangleArea(5d, 4).area());
    }
}