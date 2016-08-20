package module02;

class HomeWork20160820 {

    private static int getSum(int[] numbers) {
        int sum = 0;
        for (int num:numbers) {
            sum += num;
        }
        return sum;
    }

    private static int getMin(int[] numbers) {
        int min = numbers[0];
        for (int num:numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    private static int getMax(int[] numbers) {
        int max = numbers[0];
        for (int num:numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int getMaxPositive(int[] numbers) {
        int maxPos = numbers[0];
        for (int num:numbers) {
            if (num > 0 && num > maxPos) {
                maxPos = num;
            }
        }
        return maxPos;
    }

    private static int getMultiplied(int[] numbers) {
        int multiplied = 1;
        for (int num:numbers) {
            multiplied *= num;
        }
        return multiplied;
    }

    private static int getModFirstByLast(int[] numbers) {
        return numbers[0] % numbers[numbers.length - 1];
    }


    public static void main(String[] args) {
        int[] numbers = {21, 4, 5, 6, 7, 1, 17, 12, 11, 6 };
        System.out.println("sum: " + getSum(numbers));
        System.out.println("min: " + getMin(numbers));
        System.out.println("max: " + getMax(numbers));
        System.out.println("maxPositive: " + getMaxPositive(numbers));
        System.out.println("multiplied: " + getMultiplied(numbers));
        System.out.println("mod: " + getModFirstByLast(numbers));

    }
}
