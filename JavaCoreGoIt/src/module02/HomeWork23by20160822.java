package module02;

import java.util.Arrays;

public class HomeWork23by20160822 {

    private static String[] ownerNames = {
            "Alex", "Bob", "Caren", "Dude", "Eagle", "Foo", "Gone", "Hook", "Irene", "Joe"
    };
    private static double[] balances = {234.1, 230.5, 145.6, 51.0, 45.6, 567.4, 34.7, 876.53, 234.5, 56.7};
    private static double commission = 5;  // %

    private static String withdrawResult(String ownerName, double withdrawal) {
        double withdrawTestResult = withdrawBalance(ownerName, withdrawal);
        if (withdrawTestResult >= 0) {
            int nameIndex = getNameIndex(ownerNames, ownerName);
            balances[nameIndex] = withdrawTestResult;
            return ownerName + " " + withdrawal + " " + balances[nameIndex];
        } else {
            return ownerName + " NO";
        }
    }

    private static double withdrawBalance(String ownerName, double withdrawal) {
        int nameIndex = getNameIndex(ownerNames, ownerName);
        if (nameIndex >= 0) {
            double balance = balances[nameIndex];
            return withdrawCheck(balance, withdrawal);
        } else {
            return -1;
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

    private static double withdrawCheck(double balance, double withdrawal) {
        double commissionMoney = withdrawal * commission / 100;
        return balance - withdrawal - commissionMoney;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(ownerNames));
        System.out.println(Arrays.toString(balances));

        System.out.println(withdrawResult("Alex", 50));
        System.out.println(withdrawResult("Caren", 50));
        System.out.println(withdrawResult("Daniel", 50)); // not exist in ownerNames
        System.out.println(withdrawResult("Dude", 50));
        System.out.println(withdrawResult("Hook", 50));

        System.out.println(Arrays.toString(balances));
    }
}
