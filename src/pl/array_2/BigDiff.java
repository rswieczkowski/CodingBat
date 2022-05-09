package pl.array_2;

public class BigDiff {


    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
            if (nums[i] > max)
            max = nums[i];
        }
        return max - min;
    }

    public static void main(String[] args) {
        System.out.println(bigDiff(new int[]{10, 3, 5, 6}));
    }

}
