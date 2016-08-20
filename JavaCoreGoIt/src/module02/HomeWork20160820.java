package module02;

public class HomeWork20160820 {

    static int getSum(int[] nums){
        int sum=0;
        for (int num:nums ) sum += num;
        return sum;
    }

    static int getMin(int[] nums) {
        int min=0;
        for (int num:nums ) if (num<min) min=num;
        return min;
    }

    static int getMax(int[] nums) {
        int max=0;
        for (int num:nums ) if (num>max) max=num;
        return max;
    }

    static int getMaxPositive(int[] nums) {
        int maxPos=0;
        for (int num:nums ) if (num>0 && num>maxPos) maxPos=num;
        return maxPos;
    }

    static int getMult(int[] nums) {
        int mult=1;
        for (int num:nums ) mult*=num;
        return mult;
    }

    static int getModFirstByLast(int[] nums) {
        return nums[0] % nums[nums.length-1];
    }


    public static void main(String[] args) {
        int[] numbers = {-21,4,-5,-6,7,
                        1,17,-12,11,6};
        System.out.println("sum: " + getSum(numbers));
        System.out.println("min: " + getMin(numbers));
        System.out.println("max: " + getMax(numbers));
        System.out.println("maxPositive: " + getMaxPositive(numbers));
        System.out.println("mult: " + getMult(numbers));
        System.out.println("mod: " + getModFirstByLast(numbers));

    }
}
