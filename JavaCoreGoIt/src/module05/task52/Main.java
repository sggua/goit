package module05.task52;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(1, 200, 1, new Date(System.currentTimeMillis()), "California", "LA");
        Room room2 = new Room(2, 300, 2, new Date(System.currentTimeMillis()), "California", "Boston");
        Room room3 = new Room(3, 300, 2, new Date(System.currentTimeMillis()), "California", "Boston");

        System.out.println(room1.hashCode());
        System.out.println(room2.hashCode());
        System.out.println(room3.hashCode());
        System.out.println(room2.equals(room1));
        System.out.println(room2.equals(room3));

    }
}
