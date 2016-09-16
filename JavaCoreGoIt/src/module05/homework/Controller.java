package module05.homework;


/*
Create Controller class. It contains global variable
API apis[] = new API[3];
which contains all impelentations of API interface.
Also, controller contains two methods
Room[] requstRooms(int price, int persons, String city, String hotel)
which finds all the rooms with requested params. Method use all apis available to make search.
Found rooms create to DB


Room[] check(API api1, API api2)
Chech how many the same rooms two different apis return
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    private API apis[];


    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {
        List<Room> result = new ArrayList<>();
        for (API api : apis) {
            Room[] rooms = api.findRooms(price, persons, city, hotel);
            result.addAll(Arrays.asList(rooms));
        }
        Room[] resultFinal = result.toArray(new Room[result.size()]);
        DAO dao = new DAOImpl();
        for (Room room : resultFinal) {
            dao.save(room);
        }
        return resultFinal;
    }

    public Room[] check(API api1, API api2) {
        List<Room> result = new ArrayList<>();
        Room[] api1Rooms = api1.getRooms();
        Room[] api2Rooms = api2.getRooms();
        for (Room room1 : api1Rooms) {
            for (Room room2 : api2Rooms) {
                if (room1.equals(room2) && room1.getHotelName().equals(room2.getHotelName())) {
                    result.add(room1);
                    break;
                }
            }
        }
        return result.toArray(new Room[result.size()]);
    }
}
