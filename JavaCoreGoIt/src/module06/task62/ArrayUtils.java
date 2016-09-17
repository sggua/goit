package module06.task62;

import java.util.Arrays;

public class ArrayUtils {

    private static int getSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    private static int getMin(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    private static int getMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int getSecondLargest(int[] numbers) {
        int max = numbers[0];
        int result = Integer.MIN_VALUE;
        if (numbers.length > 1) {
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > result && numbers[i] < max) {
                    result = numbers[i];
                } else if (numbers[i] > max) {
                    result = max;
                    max = numbers[i];
                }
            }
        }
        return result;
    }

    private static int getMaxPositive(int[] numbers) {
        int maxPos = -1;
        for (int num : numbers) {
            if (num > 0 && num > maxPos) {
                maxPos = num;
            }
        }
        return maxPos;
    }

    private static int getMultiplied(int[] numbers) {
        int multiplied = 1;
        for (int num : numbers) {
            multiplied *= num;
        }
        return multiplied;
    }

    private static int getModFirstByLast(int[] numbers) {
        return numbers[0] % numbers[numbers.length - 1];
    }

    private static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < (array.length / 2 + array.length % 2); i++) {
            int secondIndex = array.length - 1 - i;
            result[i] = array[secondIndex];
            result[secondIndex] = array[i];
        }
        return result;
    }

    private static int[] findEvenElements(int[] array) {
        int[] result = new int[array.length];
        int i = 0;
        for (int number : array) {
            if (number % 2 == 0) result[i++] = number;
        }
        array = new int[i];
        System.arraycopy(result, 0, array, 0, i);
        return array;

        /* or
        List<Integer> res = new ArrayList<>();
        for (int i : array) {
            if (i % 2 == 0) res.add(i);
        }
        Integer[] resultInt = res.toArray(new Integer[res.size()]);
        int[] resultFinal = new int[resultInt.length];
        System.arraycopy(resultInt, 0, resultFinal, 0, resultInt.length);
        return resultFinal;
         */
    }

    public static void main(String[] args) {
        int[] numbersInt = {21, -4, 5, -6, 7, -1, 17, 1, 11, 6, 8};
        System.out.println("INTEGER PART");
        System.out.println("sum: " + getSum(numbersInt));
        System.out.println("min: " + getMin(numbersInt));
        System.out.println("max: " + getMax(numbersInt));
        System.out.println("maxPositive: " + getMaxPositive(numbersInt));
        System.out.println("multiplied: " + getMultiplied(numbersInt));
        System.out.println("mod: " + getModFirstByLast(numbersInt));
        System.out.println("secondLargest: " + getSecondLargest(numbersInt));
        System.out.println("reverse: " + Arrays.toString(reverse(numbersInt)));
        System.out.println("even elements: " + Arrays.toString(findEvenElements(numbersInt)));
    }
}
