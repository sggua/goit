package module05.task57;

/*
In Main class method just create Controller and make three requests with different parameters to find rooms. Also, all check methods three times with different apis to demonstrate how programs works.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Controller ctrl = new Controller();

        Room[] rooms1 = ctrl.check(new BookingComAPI(), new GoogleAPI());
        Room[] rooms2 = ctrl.check(new BookingComAPI(), new TripAdvisorAPI());
        Room[] rooms3 = ctrl.check(new TripAdvisorAPI(), new GoogleAPI());

        printRooms(rooms1);
        printRooms(rooms2);
        printRooms(rooms3);


    }

    private static void printRooms(Room[] rooms) {
        String result = "{\n";
        for (Room room : rooms) {
            result += String.valueOf(room.getId()) + ", "
                    + String.valueOf(room.getPrice()) + ", "
                    + String.valueOf(room.getPersons()) + ", "
                    + room.getDateAvailableFrom().toString() + ", "
                    + room.getHotelName() + ", "
                    + room.getCityName() + ";\n"
            ;
        }
        result = result.substring(0,result.length() - 2) + "\n}";
        System.out.println(result);
    }
}
