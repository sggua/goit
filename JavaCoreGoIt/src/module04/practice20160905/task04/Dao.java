package module04.practice20160905.task04;

public interface Dao {
    Object save(Object object);

    Object update(Object object);

    boolean delete(Object object);

    Object find(long id);
}
