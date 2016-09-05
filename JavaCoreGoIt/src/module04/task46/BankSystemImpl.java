package module04.task46;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        int maxWithdrawal = user.getBank().getLimitOfWithdrawal();
        user.getBank().setWithdrawal(amount);
        double commission = user.getBank().getCommission();
        if (amount + commission <= maxWithdrawal) {
            user.balance -= amount - commission;
        } else {
            System.out.println("Max allowed withdraw ("+user.name+") : " + maxWithdrawal);
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        int maxFund = user.getBank().getLimitOfFunding();
        if (amount <= maxFund) {
            user.balance += amount;
        } else {
            System.out.println("Max allowed amount of funding ("+user.name+") : " + maxFund);
        }
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
