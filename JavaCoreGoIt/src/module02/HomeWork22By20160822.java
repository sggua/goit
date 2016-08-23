package module02;

public class HomeWork22By20160822 {

    private static double withdrawBalance(double balance, double withdraw, double commission) {
        return balance - withdraw - withdraw * commission / 100;
    }

    private static String withdrawResult(double balance, double withdraw, double commission) {
        double result = withdrawBalance(balance, withdraw, commission);
        if (result >= 0) {
            return "OK " + withdraw * commission / 100 + " " + result;
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
