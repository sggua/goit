package module05.task54;

import java.util.Date;

public class GoogleAPI implements API {
    private Room[] rooms;

    public GoogleAPI() {
        rooms = new Room[5];
        rooms[0] = new Room(0, 100, 1, new Date(System.currentTimeMillis()), "Astoria", "Salerno");
        rooms[1] = new Room(1, 120, 1, new Date(System.currentTimeMillis()), "Astoria", "Salerno");
        rooms[2] = new Room(2, 120, 1, new Date(System.currentTimeMillis()), "Astoria", "Napoli");
        rooms[3] = new Room(3, 200, 2, new Date(System.currentTimeMillis()), "Astoria", "Napoli");
        rooms[4] = new Room(4, 200, 2, new Date(System.currentTimeMillis()), "Astoria", "Napoli");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
