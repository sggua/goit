package module03.HomeWork34;

public class HomeWork34On20160828 {

    public static void main(String[] args) {
        User user = new User("Den", 28000, 3, "Code Practice", 1500, "USD");

        System.out.println(user.getBalance());

        user.paySalary();
        System.out.println(user.getBalance());

        user.withdraw(1000);
        System.out.println(user.getBalance());
        user.withdraw(500);
        System.out.println(user.getBalance());
        user.withdraw(50000);
        System.out.println(user.getBalance());

        System.out.println(user.companyNameLength());

        System.out.println(user.getMonthsOfEmployment());
        user.monthIncreaser(5);
        System.out.println(user.getMonthsOfEmployment());


    }

}
