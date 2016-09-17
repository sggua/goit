package module06.task65;

import java.util.ArrayList;
import java.util.List;

public class UserUtils {
    static User[] paySalaryToUsers(User[] users) {
        for (User user : users) user.balance += user.salary;
        return users;
    }

    static long[] getUsersId(User[] users) {
        long[] result = new long[users.length];
        for (int i = 0; i < users.length; i++) result[i] = users[i].id;
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
            if (user.balance == balance) result.add(user);
        }
        return result.toArray(new User[result.size()]);
    }

    User[] deleteEmptyUsers(User[] users) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user != null) result.add(user);
        }
        return result.toArray(new User[result.size()]);
    }
}
