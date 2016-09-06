package module04.task46;

/*
Create Main class with main method, where you should create 6 Users: 2 of USBank, 2 of EUBank and 2 of ChinaBank. Run four different operations with erery User’s baalance and print its objects to console.

 */

public class Solution {
    static void printUsers(User[] users) {
        for (User u : users) {
            System.out.println(u.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        Bank usBank = new USBank(1, "USA", Currency.USD, 2000, 45000, 12, 3_000_000_000L);
        Bank euBank = new EUBank(2, "France", Currency.EUR, 200, 15000, 31, 1_000_000_000L);
        Bank cnBank = new ChinaBank(3, "China", Currency.USD, 5000, 30_000, 8, 8_500_000_000L);

        User[] users = new User[]{
                new User(1, "Alf", 100.50, 10, "Acme", 10000, usBank),
                new User(2, "Bob", 220.30, 12, "Bank of America", 60000, usBank),
                new User(3, "Chip", 30.33, 14, "Coca Cola", 15000, euBank),
                new User(4, "Dale", 4024.00, 16, "Dell", 14000, euBank),
                new User(5, "Eugene", 500.55, 11, "Everlast", 30000, cnBank),
                new User(6, "Felix", 65400.10, 9, "Fuji", 70000, cnBank)
        };

        printUsers(users);

        BankSystem bankSystem = new BankSystemImpl();

        for (int i = 0; i < users.length; i++) {
            bankSystem.paySalary(users[i]);
            bankSystem.transferMoney(users[5], users[i], 900);
            bankSystem.transferMoney(users[5], users[i], 50);
            bankSystem.fundUser(users[i], 1500);
            bankSystem.fundUser(users[i], 500);
            bankSystem.withdrawOfUser(users[i],500);
        }

        printUsers(users);

    }
}
