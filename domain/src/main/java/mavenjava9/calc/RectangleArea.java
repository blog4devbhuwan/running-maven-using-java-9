package mavenjava9.calc;

/**
 * @author Bhuwan Prasad Upadhyay
 */
public class RectangleArea implements Area {
    private final double length;
    private final double width;

    public RectangleArea(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "RectangleArea{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
