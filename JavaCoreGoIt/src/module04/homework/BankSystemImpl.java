package module04.homework;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank bank = user.getBank();
        int maxWithdrawal = bank.getLimitOfWithdrawal();
        double sumWithCommission = (bank.getCommission(amount) / 100.0 + 1.0) * amount;
        double testBalance = user.balance - sumWithCommission;

        if (sumWithCommission <= maxWithdrawal) {
            if (testBalance >= 0) {
                user.balance = testBalance;
            } else {
                System.out.println("Not enough money to withdraw (" + user.name + ") : " + amount);
            }
        } else {
            System.out.println("Max allowed withdraw (" + user.name + ") : " + maxWithdrawal);
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        int maxFund = user.getBank().getLimitOfFunding();
        if (amount <= maxFund) {
            user.balance += amount;
        } else {
            System.out.println("Max allowed amount of funding (" + user.name + ") : " + maxFund);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.getBank().getCurrency() == toUser.getBank().getCurrency()) {
            withdrawOfUser(fromUser, amount);
            fundUser(toUser, amount);
        } else {
            System.out.println("Can not transfer " +
                    "from " + fromUser.getBank().getCurrency() + " (" + fromUser.name + ") " +
                    "to " + toUser.getBank().getCurrency() + " (" + toUser.name + ")");
        }
    }

    @Override
    public void paySalary(User user) {
        fundUser(user, user.salary);
    }
}
