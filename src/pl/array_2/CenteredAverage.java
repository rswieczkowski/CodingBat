package pl.array_2;

public class CenteredAverage {
    public int centeredAverage(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
            if (nums[i] > max)
                max = nums[i];
            sum += nums[i];
        }
        return (sum - max - min) / (nums.length - 2);

    }
}
