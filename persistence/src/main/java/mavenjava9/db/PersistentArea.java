package mavenjava9.db;


import mavenjava9.calc.Area;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bhuwan Prasad Upadhyay
 */
public class PersistentArea {
    private List<Area> areas = new ArrayList<>();

    public void add(Area area) {
        areas.add(area);
    }

    public List<Area> findAll() {
        return areas;
    }
}
