package module04.task46;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        user.balance -= amount;
    }

    @Override
    public void fundUser(User user, int amount) {
        user.balance += amount;
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        withdrawOfUser(fromUser, amount);
        fundUser(toUser, amount);
    }

    @Override
    public void paySalary(User user) {
        fundUser(user, user.salary);
    }

    public BankSystemImpl() {
    }
}
