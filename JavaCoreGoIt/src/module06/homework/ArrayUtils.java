package module06.homework;

import java.util.Arrays;

public final class ArrayUtils {

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

        for (int value : numbers) {
            if (value > max) {
                result = max;
                max = value;
            }
            if (result < value && value < max) {
                result = value;
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
        for (int index1 = 0; index1 < array.length / 2; index1++) {
            int index2 = array.length - 1 - index1;
            swap(array, index1, index2);
        }
        return array;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static int[] findEvenElements(int[] array) {
        int[] result = new int[0];
        for (int value : array) {
            if (value % 2 == 0) {
                result = addValue(result, value);
            }
        }
        return result;
    }

    private static int[] addValue(int[] array, int value) {
        int[] result = new int[0];
        result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = value;
        return result;
    }

}
