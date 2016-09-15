package module05.task56;

import java.util.Date;

public class BookingComAPI implements API {
    private Room[] rooms;

    public BookingComAPI() {
        rooms = new Room[5];
        rooms[0] = new Room(0, 100, 1, new Date(System.currentTimeMillis()), "Astoria", "Salerno");
        rooms[1] = new Room(1, 120, 1, new Date(System.currentTimeMillis()), "Astoria", "Salerno");
        rooms[2] = new Room(2, 120, 1, new Date(System.currentTimeMillis()), "Astoria", "Napoli");
        rooms[3] = new Room(3, 200, 2, new Date(System.currentTimeMillis()), "Astoria", "Napoli");
        rooms[4] = new Room(4, 200, 2, new Date(System.currentTimeMillis()), "Astoria", "Napoli");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room roomToFind = new Room(0, price, persons, new Date(), hotel, city);
        Room[] result = new Room[100];
        int i = 0;
        for (Room room : rooms) {
            if (room != null && room.equals(roomToFind) && room.getHotelName().equals(hotel)) {
                if (i >= result.length) {
                    Room[] tmpResult = new Room[result.length + i + 100];
                    System.arraycopy(result, 0, tmpResult, 0, result.length);
                    result = tmpResult;
                }
                result[i++] = room;
            }
        }
        Room[] resultFinal = new Room[i];
        System.arraycopy(result, 0, resultFinal, 0, i);
        return resultFinal;
    }
}
