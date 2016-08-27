package module02;

import java.util.Arrays;

public class HomeWork24by20160823 {

    private static String[] ownerNames = {
            "Alex", "Bob", "Caren", "Dude", "Eagle", "Foo", "Gone", "Hook", "Irene", "Joe"
    };
    private static double[] balances = {234.1, 230.5, 145.6, 51.0, 45.6, 567.4, 34.7, 876.53, 234.5, 56.7};

    private static String fundResult(String ownerName, double fund) {
        double resultFund = fundBalance(ownerName, fund);
        if (fund > 0) {
            if (resultFund >= 0) {
                return ownerName + " " + resultFund;
            } else {
                return ownerName + "'s balance probably not exists";
            }
        } else {
            return ownerName + "'s balance was not funded due to incorrect fund amount (" + fund + ")";
        }
    }

    private static double fundBalance(String ownerName, double fund) {
        int nameIndex = getNameIndex(ownerName);
        if (nameIndex >= 0 && fund > 0) {
            return fundBalanceByIndex(nameIndex, fund);
        } else {
            return -1;
        }
    }

    private static int getNameIndex(String ownerName) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                return i;
            }
        }
        return -1; // if not found
    }

    private static double fundBalanceByIndex(int index, double fund) {
        balances[index] += fund;
        return balances[index];
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(ownerNames));
        System.out.println(Arrays.toString(balances));

        System.out.println(fundResult("Alex", 50));
        System.out.println(fundResult("Caren", 0));
        System.out.println(fundResult("Daniel", 50));
        System.out.println(fundResult("Dude", -20.5));
        System.out.println(fundResult("Hook", 50));

        System.out.println(Arrays.toString(balances));

    }
}
