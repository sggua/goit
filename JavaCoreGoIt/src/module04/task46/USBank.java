package module04.task46;

/*
 USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
 limit of funding - 10000 if EUR and no limit if USD
 monthly rate - 1% with USD and 1.5% with EUR
 commission - 5% if USD and up to 1000, 7% if USD and more than 1000
 6% if EUR and up to 1000 and 8% if EUR and more than 1000
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 1000;
        } else if (getCurrency() == Currency.EUR) {
            return 1200;
        }
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) {
            return 10000;
        } else if (getCurrency() == Currency.USD) {
            return Integer.MAX_VALUE;
        }
        return 0;
    }

    @Override
    public int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 1;
        } else if (getCurrency() == Currency.EUR) {
            return 2;  // 1.5  in a task but cannot be 1.5 if int
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
            return 6;
        } else if (getCurrency() == Currency.EUR && sum > 1000) {
            return 8;
        } else {
            return 0;
        }
    }

}
