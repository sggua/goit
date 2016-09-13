package module04.task46;

/*
EUBank: limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
limit of funding - 20000 if EUR and 10000 if USD
monthly rate - 0% with USD and 1% with EUR
commission - 5% if USD and up to 1000, 7% if USD and more than 1000
2% if EUR and up to 1000 and 4% if EUR and more than 1000
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 2000;
        } else if (getCurrency() == Currency.EUR) {
            return 2200;
        }
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) {
            return 20000;
        } else if (getCurrency() == Currency.USD) {
            return 10000;
        }
        return 0;
    }

    @Override
    public int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 0;
        } else if (getCurrency() == Currency.EUR) {
            return 1;
        }
        return 0;
    }

    @Override
    public int getCommission(int sum) {

        if (getCurrency() == Currency.USD && sum <= 1000) {
            return 5;
        } else if (getCurrency() == Currency.USD && sum > 1000) {
            return 7;
        } else if (getCurrency() == Currency.EUR && sum <= 1000) {
            return 2;
        } else if (getCurrency() == Currency.EUR && sum > 1000) {
            return 4;
        } else {
            return 0;
        }

    }


}
