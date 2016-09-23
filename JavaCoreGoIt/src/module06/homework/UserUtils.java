package module06.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserUtils {

    // 1. Почему не все методы статические
    // 2. Почему методы не переиспользуются

    static User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            if (user != null) user.balance += user.salary;
        }
        return users;
    }

    // Сделай результируйщий массив без вот этих -1, тут опять же можно зауюзать метод уникальных юзеров
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

    // Попробуй обойтись без листов, я понимаю что я тебе их показал и всеже

/*
        Используй вот такую конструкцию во всех методах:

        for (User user : users) {
            User[] result = new User[0];
            result = Arrays.copyOf(result, result.length + 1);
            result[result.length - 1] = user;
        }
*/

    // Уникальные это не нулевые и не повторяющиеся(для удаления нулевых у тебя есть метод)
    User[] uniqueUsers(User[] users) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (!result.contains(user)) result.add(user);
        }
        return result.toArray(new User[result.size()]);
    }

    // Здесь ты должен найти совподения баланса по уникальным юзерам
    User[] usersWithContitionalBalance(User[] users, int balance) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user != null && user.balance == balance) result.add(user);
        }
        return result.toArray(new User[result.size()]);
    }

    // Здесь ты должен удалить просто юзеров == null
    User[] deleteEmptyUsers(User[] users) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user != null && !"".equals(user.firstName) && !"".equals(user.lastName)) {
                result.add(user);
            }
        }
        return result.toArray(new User[result.size()]);
    }
}
