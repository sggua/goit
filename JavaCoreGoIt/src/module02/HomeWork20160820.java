package module02;

class HomeWork20160820 {

    private static int getSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    private static double getSum(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
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

    private static double getMin(double[] numbers) {
        double min = numbers[0];
        for (double num : numbers) {
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

    private static double getMax(double[] numbers) {
        double max = numbers[0];
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int getSecondLargest(int[] numbers) {
        int max = getMax(numbers);
        int secondMax = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    private static double getSecondLargest(double[] numbers) {
        double max = getMax(numbers);
        double secondMax = Double.MIN_VALUE;
        for (double num : numbers) {
            if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        return secondMax;
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

    private static double getMaxPositive(double[] numbers) {
        double maxPos = -1;
        for (double num : numbers) {
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

    private static double getMultiplied(double[] numbers) {
        double multiplied = 1;
        for (double num : numbers) {
            multiplied *= num;
        }
        return multiplied;
    }

    private static int getModFirstByLast(int[] numbers) {
        return numbers[0] % numbers[numbers.length - 1];
    }

    private static double getModFirstByLast(double[] numbers) {
        return numbers[0] % numbers[numbers.length - 1];
    }


    public static void main(String[] args) {
        int[] numbersInt = {21, -4, 5, -6, 7, -1, 17, 1, 11, 6};
        double[] numbersDouble = {2.1, -0.4, 5.7, -3.6, 7.6, -1.0, 17.3, 0.1, 11.9, 6.3};
        System.out.println("INTEGER PART");
        System.out.println("sum: " + getSum(numbersInt));
        System.out.println("min: " + getMin(numbersInt));
        System.out.println("max: " + getMax(numbersInt));
        System.out.println("maxPositive: " + getMaxPositive(numbersInt));
        System.out.println("multiplied: " + getMultiplied(numbersInt));
        System.out.println("mod: " + getModFirstByLast(numbersInt));
        System.out.println("secondLargest: " + getSecondLargest(numbersInt));
        System.out.println("\nDOUBLE PART");
        System.out.println("sum: " + getSum(numbersDouble));
        System.out.println("min: " + getMin(numbersDouble));
        System.out.println("max: " + getMax(numbersDouble));
        System.out.println("maxPositive: " + getMaxPositive(numbersDouble));
        System.out.println("multiplied: " + getMultiplied(numbersDouble));
        System.out.println("mod: " + getModFirstByLast(numbersDouble));
        System.out.println("secondLargest: " + getSecondLargest(numbersDouble));

    }
}
