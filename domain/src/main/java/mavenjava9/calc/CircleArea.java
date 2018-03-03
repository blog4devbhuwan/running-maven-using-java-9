package mavenjava9.calc;

import static java.lang.Math.PI;

/**
 * @author Bhuwan Prasad Upadhyay
 */
public class CircleArea implements Area {

    private final double radius;

    public CircleArea(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.round(PI * radius * radius);
    }

    @Override
    public String toString() {
        return "CircleArea{" +
                "radius=" + radius +
                '}';
    }
}
