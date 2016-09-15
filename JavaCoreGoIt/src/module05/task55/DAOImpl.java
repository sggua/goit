package module05.task55;

import java.util.Date;

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(room.toString() + " saved successfully.");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.toString() + " deleted successfully.");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.toString() + " updated successfully.");
        return null;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(0, 1, 2, new Date(), "Dnipro", "Kyiv");
        System.out.println(room.toString() + " was found successfully.");
        return null;
    }
}
