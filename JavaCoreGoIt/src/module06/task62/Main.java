package module06.task62;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbersInt = {21, -4, 5, -6, 7, -1, 17, 1, 11, 6, 8};
        System.out.println("INTEGER PART");
        System.out.println("sum: " + ArrayUtils.getSum(numbersInt));
        System.out.println("min: " + ArrayUtils.getMin(numbersInt));
        System.out.println("max: " + ArrayUtils.getMax(numbersInt));
        System.out.println("maxPositive: " + ArrayUtils.getMaxPositive(numbersInt));
        System.out.println("multiplied: " + ArrayUtils.getMultiplied(numbersInt));
        System.out.println("mod: " + ArrayUtils.getModFirstByLast(numbersInt));
        System.out.println("secondLargest: " + ArrayUtils.getSecondLargest(numbersInt));
        System.out.println("reverse: " + Arrays.toString(ArrayUtils.reverse(numbersInt)));
        System.out.println("even elements: " + Arrays.toString(ArrayUtils.findEvenElements(numbersInt)));
    }
}
