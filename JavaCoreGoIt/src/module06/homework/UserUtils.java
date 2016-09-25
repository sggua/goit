package module06.homework;

import java.util.Arrays;

public class UserUtils {

    static User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            if (user != null) {
                user.setBalance(user.getBalance() + user.getSalary());
            }
        }
        return users;
    }

    static long[] getUsersId(User[] users) {
        User[] usersUnique = uniqueUsers(users);
        long[] result = new long[usersUnique.length];
        for (int i = 0; i < usersUnique.length; i++) {
            result[i] = usersUnique[i].getId();
        }
        return result;
    }

    static User[] uniqueUsers(User[] users) {
        User[] result = new User[0];
        for (User user : users) {
            if (user != null && !containsUser(result, user)) {
                result = addUser(result, user);
            }
        }
        return result;
    }

    static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] usersUnique = uniqueUsers(users);
        User[] result = new User[0];
        for (User user : usersUnique) {
            if (user != null && user.getBalance() == balance) {
                result = addUser(result,user);
            }
        }
        return result;
    }

    static User[] deleteEmptyUsers(User[] users) {
        User[] result = new User[0];
        for (User user : users) {
            if (user != null) {
                result = addUser(result,user);
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
        for (User u : users) {
            if (u.equals(user)) return true;
        }
        return false;
    }
}
