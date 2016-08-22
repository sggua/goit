package module02;

import java.util.Arrays;

public class HomeWork24by20160823 {

    private static String[] ownerNames = {
            "Alex", "Bob", "Caren", "Dude", "Eagle", "Foo", "Gone", "Hook", "Irene", "Joe"
    };
    private static double[] balances = {234.1, 230.5, 145.6, 51.0, 45.6, 567.4, 34.7, 876.53, 234.5, 56.7};

    private static String fund(double fund, String name, double[] balances, String[] names) {
        int nameIndex = getNameIndex(names, name);
        if (nameIndex >= 0) {
            if (fund > 0) {
                return name + " " + fundBalance(balances, nameIndex, fund);
            } else {
                return name + "'s balance was not funded due to incorrect fund amount (" + fund + ")";
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

    private static double fundBalance(double[] balances, int index, double fund) {
        balances[index] += fund;
        return balances[index];
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(ownerNames));
        System.out.println(Arrays.toString(balances));

        System.out.println(fund(50, "Alex", balances, ownerNames));
        System.out.println(fund(50, "Caren", balances, ownerNames));
        System.out.println(fund(50, "Daniel", balances, ownerNames));
        System.out.println(fund(-20.5, "Dude", balances, ownerNames));
        System.out.println(fund(50, "Hook", balances, ownerNames));

        System.out.println(Arrays.toString(balances));

    }
}
