package module05.homework;

/*
In Main class method just create Controller and make three requests with different parameters to find rooms. Also, all check methods three times with different apis to demonstrate how programs works.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        API[] apis = {new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()};
        Controller ctrl = new Controller(apis);

        Room[] rooms01 = ctrl.check(apis[0], apis[1]);
        Room[] rooms02 = ctrl.check(apis[0], apis[2]);
        Room[] rooms12 = ctrl.check(apis[1], apis[2]);

        System.out.println("Check " + apis[0].getName() + " to " + apis[1].getName()
                + " : (" + rooms01.length + " equals)\n" + Arrays.toString(rooms01) + "\n");
        System.out.println("Check " + apis[0].getName() + " to " + apis[2].getName()
                + " : (" + rooms02.length + " equals)\n" + Arrays.toString(rooms02) + "\n");
        System.out.println("Check " + apis[1].getName() + " to " + apis[2].getName()
                + " : (" + rooms12.length + " equals)\n" + Arrays.toString(rooms12) + "\n");

    }

}
