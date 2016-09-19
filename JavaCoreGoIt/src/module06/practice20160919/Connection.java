package module06.practice20160919;

public class Connection {

    private static final Connection INSTANCE = new Connection();    // звичайна ініціалізація
    private Connection() {
    }

// нелінива ініціалізація



//    лінива ініціалізація
// private static Connection INSTANCE;
//    static {
//        INSTANCE = new Connection();
//    }
//
//    public static Connection getInstance() {
//        return INSTANCE;
//    }
//
//public static Connection getInstance() {
//    if (INSTANCE==null) INSTANCE = new Connection();
//    return INSTANCE;
//}




}
