package module05.homework;

import java.util.Date;

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(room.toString() + " saved successfully.");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.toString() + " deleted successfully.");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.toString() + " updated successfully.");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(0, 1, 2, new Date(), "Dnipro", "Kyiv");
        System.out.println(room.toString() + " was found successfully.");
        return room;
    }
}
