package module04.task46;

public class BankSystemImpl implements BankSystem {
    public BankSystemImpl() {
    }

    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank bank = user.getBank();
        int maxWithdrawal = bank.getLimitOfWithdrawal();
        double commissionSum = (bank.getCommission(amount) / 100.0 + 1.0) * amount; // <-- ты уверен что это работает?
        // Это сумма с коммисией amount + commission
        // Переименуй в sumWithCommission

        double testBalance = user.balance - amount - commissionSum; // а тут ты не просто amount вычитаешь а еще и commissionSum(amount + commission)
        // убери "- amount "

        if (amount + commissionSum <= maxWithdrawal) { // нужно убрать "amount +" и оставить только commissionSum
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
