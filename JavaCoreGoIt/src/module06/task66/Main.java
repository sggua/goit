package module06.task66;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        User[] users = {
                new User(0, "Peter", "Green", 1000, 200),
                new User(1, "Elza", "Smith", 1200, 100),
                new User(2, "Elza", "Smith", 1200, 100),
                new User(3, "Marek", "Woitow", 700, 200),
                new User(4, "", "", 700, 200),                  // empty user
                null,                                           // empty user
                new User(6, "John", "Scott", 2000, 2000),
                new User(7, "Walter", "Volkenstein", 1500, 700),
                null                                            // empty user
        };

        UserUtils userUtils = new UserUtils();

        int balance = 200;

        System.out.println("Init: " + Arrays.toString(users));
        System.out.println("Uniques: " + Arrays.toString(userUtils.uniqueUsers(users))); // non-static
        System.out.println("Balance (" + balance + ") : " + Arrays.toString(userUtils.usersWithContitionalBalance(users,balance))); // non-static

        users = UserUtils.paySalaryToUsers(users);  // static

        System.out.println("After salary payment: " + Arrays.toString(users));
        System.out.println("Id's: " + Arrays.toString(UserUtils.getUsersId(users)));

        users = userUtils.deleteEmptyUsers(users);  // non-static

        System.out.println("After deleting empties: " + Arrays.toString(users));


    }
}
