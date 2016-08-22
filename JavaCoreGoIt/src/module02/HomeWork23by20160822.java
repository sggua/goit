package module02;

import java.util.Arrays;

public class HomeWork23by20160822 {

    private static String[] ownerNames = {
            "Alex", "Bob", "Caren", "Dude", "Eagle", "Foo", "Gone", "Hook", "Irene", "Joe"
    };
    private static double[] balances = {234.1, 230.5, 145.6, 51.0, 45.6, 567.4, 34.7, 876.53, 234.5, 56.7};
    private static double commission = 5;  // %

    private static String withdraw(
            double withdraw, String name, double[] balances, String[] names, double commission) {

        int nameIndex = getNameIndex(names, name);
        if (nameIndex >= 0) {
            double balance = balances[nameIndex];
            double withdrawTestResult = withdrawCheck(balance, withdraw, commission);

            if (withdrawTestResult >= 0) {
                double sumOfWithdraw = balance - withdrawTestResult;
                balances[nameIndex] = withdrawTestResult;
                return name + " " + sumOfWithdraw + " " + balances[nameIndex];
            } else {
                return name + " NO";
            }
        } else {
            return name + " not found";
        }

    }

    private static int getNameIndex(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }
        return -1; // if not found
    }

    private static double withdrawCheck(double balance, double withdraw, double commission) {
        double commissionMoney = withdraw * commission / 100;
        return balance - withdraw - commissionMoney;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(ownerNames));
        System.out.println(Arrays.toString(balances));

        System.out.println(withdraw(50, "Alex", balances, ownerNames, commission));
        System.out.println(withdraw(50, "Caren", balances, ownerNames, commission));
        System.out.println(withdraw(50, "Daniel", balances, ownerNames, commission));
        System.out.println(withdraw(50, "Dude", balances, ownerNames, commission));
        System.out.println(withdraw(50, "Hook", balances, ownerNames, commission));

        System.out.println(Arrays.toString(balances));
    }
}
