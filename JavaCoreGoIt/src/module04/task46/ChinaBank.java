package module04.task46;

/*
ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
limit of funding - 5000 if EUR and 10000 if USD
monthly rate - 1% with USD and 0% with EUR
commission - 3% if USD and up to 1000, 5% if USD and more than 1000
10% if EUR and up to 1000 and 11% if EUR and more than 1000
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                     double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 100;
        } else if (getCurrency() == Currency.EUR) {
            return 150;
        }
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) {
            return 5000;
        } else if (getCurrency() == Currency.USD) {
            return 10000;
        }
        return 0;
    }

    @Override
    public int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 1;
        } else if (getCurrency() == Currency.EUR) {
            return 0;
        }
        return 0;
    }

    @Override
    public int getCommission() {
        // Как насчет написать несколько читабельней и проще
/*
        if (getCurrency() == Currency.USD && withdrawal <= 1000) {
            return 3;
        } else if (getCurrency() == Currency.USD && withdrawal > 1000) {
            return 5;
        } else if (getCurrency() == Currency.EUR && withdrawal <= 1000) {
            return 10;
        } else if (getCurrency() == Currency.EUR && withdrawal > 1000) {
            return 11;
        }
*/

        if (getCurrency() == Currency.USD) {
            if (withdrawal <= 1000) {
                return 3;
            } else if (withdrawal > 1000) {
                return 5;
            }
        } else if (getCurrency() == Currency.EUR) {
            if (withdrawal <= 1000) {
                return 10;
            } else if (withdrawal > 1000) {
                return 11;
            }
        }
        return 0;
    }

    public double getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;
    }

}
