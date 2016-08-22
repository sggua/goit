package module02;

public class HomeWork22By20160822 {

    private static String withdrawResult(double bal, double withdraw, double commission) {
        double commissionMoney = withdraw * commission / 100;
        double result = bal - withdraw - commissionMoney;
        if (result >= 0) {
            return "OK " + commissionMoney + " " + result;
        } else return "NO";
    }

    public static void main(String[] args) {
        double balance = 250.0;
        double withdraw = 25.0;
        double commission = 5.0;  // in %

        System.out.println(withdrawResult(balance, withdraw, commission));

        balance = 205;
        System.out.println(withdrawResult(balance, withdraw, commission));

        balance = 26;
        System.out.println(withdrawResult(balance, withdraw, commission));

    }

}
