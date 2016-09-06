package module04.practice20160905.task04;

public class UserDAO implements Dao{
    @Override
    public Object save(Object object) {
        System.out.println(object.toString() + " saved");
        return object;
    }

    @Override
    public Object update(Object object) {
        System.out.println(object.toString() + " updated");
        return object;
    }

    @Override
    public boolean delete(Object object) {
        System.out.println(object.toString() + " deleted");
        return false;
    }

    @Override
    public Object find(long id) {
        User user = new User("AnyBody"); // i.e.
        user.setId(id);
        System.out.println(user.toString() + " found");
        return user;
    }
}
