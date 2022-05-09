package pl.recursion_2;

public class SplitArray {

    public boolean splitArray(int[] nums) {
        int index = 0;
        int sumA = 0;
        int sumB = 0;

        return isSumSame(index, nums, sumA, sumB);
    }

    private boolean isSumSame(int index, int[] nums, int sumA, int sumB) {

        if (index >= nums.length)
            return sumA == sumB;

        int value = nums[index];

        return isSumSame(index + 1, nums, sumA + value, sumB) || isSumSame(index + 1, nums, sumA, sumB + value);
    }

}
