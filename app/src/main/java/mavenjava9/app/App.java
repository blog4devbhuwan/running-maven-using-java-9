package mavenjava9.app;

import mavenjava9.service.AreaService;

/**
 * @author Bhuwan Prasad Upadhyay
 */
public class App {
    public static void main(String[] args) {
        AreaService service = new AreaService();
        service.circle(23);
        service.rectangle(2, 3);
        service.all().forEach(System.out::println);
    }
}
