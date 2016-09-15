package module05.task56;


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
public class Controller {
    private API apis[] = {new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()};


    public Room[] requstRooms(int price, int persons, String city, String hotel) {
        Room[] result = new Room[0];
        DAO dao = new DAOImpl();
        for (API api : apis) {
            Room[] rooms = api.findRooms(price, persons, city, hotel);
            if (rooms != null && rooms.length > 0) {
                Room[] tmpResult = new Room[result.length + rooms.length];
                System.arraycopy(result, 0, tmpResult, 0, result.length);
                System.arraycopy(rooms, 0, tmpResult, result.length, rooms.length);
                result = tmpResult;
            }
        }
        for (Room room : result) {
            dao.save(room);
        }
        return result;
    }

    public Room[] check(API api1, API api2) {
        return null;
    }

}
