package module06.homework;

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


        System.out.println("// task 6.2\n");

        int[] numbersInt = {21, -4, 5, -6, 7, -1, 17, 1, 11, 6, 8};
        System.out.println("Init: " + Arrays.toString(numbersInt));
        System.out.println("sum: " + ArrayUtils.getSum(numbersInt));
        System.out.println("min: " + ArrayUtils.getMin(numbersInt));
        System.out.println("max: " + ArrayUtils.getMax(numbersInt));
        System.out.println("maxPositive: " + ArrayUtils.getMaxPositive(numbersInt));
        System.out.println("multiplied: " + ArrayUtils.getMultiplied(numbersInt));
        System.out.println("mod: " + ArrayUtils.getModFirstByLast(numbersInt));
        System.out.println("secondLargest: " + ArrayUtils.getSecondLargest(numbersInt));
        System.out.println("reverse: " + Arrays.toString(ArrayUtils.reverse(numbersInt)));
        System.out.println("even elements: " + Arrays.toString(ArrayUtils.findEvenElements(numbersInt)));


        System.out.println("\n// task 6.6\n");

        UserUtils userUtils = new UserUtils();

        int balance = 200;

        System.out.println("Init: " + Arrays.toString(users));
        System.out.println("Uniques: " + Arrays.toString(userUtils.uniqueUsers(users))); // non-static
        System.out.println("Balance (" + balance + ") : " + Arrays.toString(userUtils.usersWithContitionalBalance(users, balance))); // non-static

        users = UserUtils.paySalaryToUsers(users);  // static

        System.out.println("After salary payment: " + Arrays.toString(users));
        System.out.println("Id's: " + Arrays.toString(UserUtils.getUsersId(users)));

        users = userUtils.deleteEmptyUsers(users);  // non-static

        System.out.println("After deleting empties: " + Arrays.toString(users));


    }
}
