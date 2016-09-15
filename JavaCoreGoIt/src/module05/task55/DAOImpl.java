package module05.task55;

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
        System.out.println(id + " was found successfully.");
        return null;
    }
}
