package module06.homework;

import java.util.ArrayList;
import java.util.List;

final public class ArrayUtils {

    public static int getSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static int getMin(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int getMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int getSecondLargest(int[] numbers) {
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

    public static int getMaxPositive(int[] numbers) {
        int maxPos = -1;
        for (int num : numbers) {
            if (num > 0 && num > maxPos) {
                maxPos = num;
            }
        }
        return maxPos;
    }

    public static int getMultiplied(int[] numbers) {
        int multiplied = 1;
        for (int num : numbers) {
            multiplied *= num;
        }
        return multiplied;
    }

    public static int getModFirstByLast(int[] numbers) {
        return numbers[0] % numbers[numbers.length - 1];
    }

    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < (array.length / 2 + array.length % 2); i++) {
            int secondIndex = array.length - 1 - i;
            result[i] = array[secondIndex];
            result[secondIndex] = array[i];
        }
        return result;
    }

    public static int[] findEvenElements(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i : array) if (i % 2 == 0) result.add(i);
        Integer[] resultInt = result.toArray(new Integer[result.size()]);
        int[] resultFinal = new int[resultInt.length];
        for (int i = 0; i < resultInt.length; i++) resultFinal[i] = resultInt[i];
        return resultFinal;
    }

}
