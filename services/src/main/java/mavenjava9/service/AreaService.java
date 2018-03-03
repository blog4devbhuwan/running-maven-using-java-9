package mavenjava9.service;


import mavenjava9.calc.Area;
import mavenjava9.calc.CircleArea;
import mavenjava9.calc.RectangleArea;
import mavenjava9.db.PersistentArea;

import java.util.List;

/**
 * @author Bhuwan Prasad Upadhyay
 */
public class AreaService {

    private PersistentArea persistent = new PersistentArea();

    public void circle(double radius) {
        persistent.add(new CircleArea(radius));
    }


    public void rectangle(double length, double width) {
        persistent.add(new RectangleArea(length, width));
    }

    public List<Area> all() {
        return persistent.findAll();
    }
}
