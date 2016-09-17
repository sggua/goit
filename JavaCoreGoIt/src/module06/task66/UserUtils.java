package module06.task66;

import java.util.ArrayList;
import java.util.List;

public class UserUtils {
    static User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            if (user != null) user.balance += user.salary;
        }
        return users;
    }

    static long[] getUsersId(User[] users) {
        long[] result = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                result[i] = users[i].id;
            } else {
                result[i] = -1;
            }
        }
        return result;
    }

    User[] uniqueUsers(User[] users) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (!result.contains(user)) result.add(user);
        }
        return result.toArray(new User[result.size()]);
    }

    User[] usersWithContitionalBalance(User[] users, int balance) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user != null && user.balance == balance) result.add(user);
        }
        return result.toArray(new User[result.size()]);
    }

    User[] deleteEmptyUsers(User[] users) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user != null && !user.firstName.equals("") && !user.lastName.equals("")) {
                result.add(user);
            }
        }
        return result.toArray(new User[result.size()]);
    }
}
