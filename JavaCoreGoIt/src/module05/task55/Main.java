package module05.task55;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Room room = new Room(1, 100, 1, new Date(), "Lybid", "Kyiv");
        DAO dao = new DAOImpl();
        dao.save(room);
        dao.delete(room);
        dao.update(room);
        dao.findById(1);

    }
}
