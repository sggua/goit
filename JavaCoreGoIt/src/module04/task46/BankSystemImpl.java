package module04.task46;

public class BankSystemImpl implements BankSystem {

/*
    Этот конструктор есть и без того по умолчанию
    public BankSystemImpl() {
    }
*/

    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank bank = user.getBank(); // <--
        // Нужно сосиски нарезать в переменные,
        // представь что по user.getBank() каждый раз идет обращение
        // в базу за банком юзера и по твоему коду это обращение было 3 раза
        // каждое обращение в базу стоит обычно сколько то денег
        // к примеру если она у нас облачная

        int maxWithdrawal = bank.getLimitOfWithdrawal();
        bank.setWithdrawal(amount);
        double commissionSum = (bank.getCommission() / 100.0 + 1.0) * amount;
        double testBalance = user.balance - amount - commissionSum;
        if (amount + commissionSum <= maxWithdrawal) {
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
        // Это не совсем так, просто в условии не было конвертера
        // В правильной задаче вместо amount били бы Money{amount, currency}
        // и логика была бы куда сложнее
        if (fromUser.getBank().getCurrency().equals(toUser.getBank().getCurrency())) {
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
