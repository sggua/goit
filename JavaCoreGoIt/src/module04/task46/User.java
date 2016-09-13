package module04.task46;

public class User {
    long id;
    String name;
    double balance;
    int monthOfEmployment;
    String companyName;
    int salary;
    Bank bank;

    public User(long id, String name, double balance, int monthOfEmployment, String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthOfEmployment = monthOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        String separator = "\n";  //  or ";"
        return "User id : " + id
                + separator + "User name : " + name
                + separator + "User balance : " + balance
                + separator + "User monthOfEmployment : " + monthOfEmployment
                + separator + "User companyName : " + companyName
                + separator + "User salary : " + salary
                + separator + bank.toString()
                ;

    }

}
