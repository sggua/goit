package module04.task44;

public class User {
    long id;
    String name;
    double balance;
    int monthOfEmployment;
    String companyName;
    int salary;
    Bank bank;

    @Override
    public String toString() {
        String separator = "\n";  //  or ";"
        return "id : " + id
                + separator + "name : " + name
                + separator + "balance : " + balance
                + separator + "monthOfEmployment : " + monthOfEmployment
                + separator + "companyName : " + companyName
                + separator + "salary : " + salary
                + separator + "Bank id : " + bank.getId()
                + separator + "Bank bankCountry : " + bank.getBankCountry()
                + separator + "Bank currency : " + bank.getCurrency()
                + separator + "Bank numberOfEmployees : " + bank.getNumberOfEmployees()
                + separator + "Bank avrSalaryOfEmployee : " + bank.getAvrSalaryOfEmployee()
                + separator + "Bank rating : " + bank.getRating()
                + separator + "Bank totalCapital : " + bank.getTotalCapital()
                ;

    }

}
