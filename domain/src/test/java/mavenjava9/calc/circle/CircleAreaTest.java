package mavenjava9.calc.circle;

import mavenjava9.calc.CircleArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Bhuwan Prasad Upadhyay
 */
class CircleAreaTest {
    @Test
    void calculateAreaCorrectly() {
        assertEquals(13, new CircleArea(2).area());
    }
}