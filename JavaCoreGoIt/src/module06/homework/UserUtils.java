package module06.homework;

import java.util.Arrays;

public class UserUtils {

    static User[] paySalaryToUsers(User[] users) {
        users = uniqueUsers(users);
        for (User user : users) {
            user.setBalance(user.getBalance() + user.getSalary());
        }
        return users;
    }

    static long[] getUsersId(User[] users) {
        users = uniqueUsers(users);
        long[] result = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            result[i] = users[i].getId();
        }
        return result;
    }

    static User[] uniqueUsers(User[] users) {
        users = deleteEmptyUsers(users);
        User[] result = new User[0];
        for (User user : users) {
            boolean containsUser = containsUser(result, user);
            if (!containsUser) {
                result = addUser(result, user);
            }
        }
        return result;
    }

    static User[] usersWithContitionalBalance(User[] users, int balance) {
        users = uniqueUsers(users);
        User[] result = new User[0];
        for (User user : users) {
            if (user.getBalance() == balance) {
                result = addUser(result, user);
            }
        }
        return result;
    }

    static User[] deleteEmptyUsers(User[] users) {
        User[] result = new User[0];
        for (User user : users) {
            if (user != null) {
                result = addUser(result, user);
            }
        }
        return result;
    }

    static User[] addUser(User[] users, User user) {
        User[] result = new User[0];
        result = Arrays.copyOf(users, users.length + 1);
        result[result.length - 1] = user;
        return result;
    }

    static boolean containsUser(User[] users, User user) {
        for (User key : users) {
            if (key.equals(user)) {
                return true;
            }
        }
        return false;
    }
}
