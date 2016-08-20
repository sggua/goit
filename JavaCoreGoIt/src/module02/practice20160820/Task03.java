package module02.practice20160820;

public class Task03 {

    static double testWithdraw(double bal, double withdraw, double tax){
        return bal - tax - withdraw;
    }

    public static void main(String[] args) {
        double balance = 250.0;
        double cash = 199.0;
        double tax = 1.5;

        double result = testWithdraw(balance,cash,tax);

        if (result>=0) System.out.println("GO: " + result);
        else System.out.println("Oops..");

    }
}
