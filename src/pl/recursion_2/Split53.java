package pl.recursion_2;

public class Split53 {

    public boolean split53(int[] nums) {
        int index = 0;
        int sumA = 0;
        int sumB = 0;

        return isSplittable(index, nums, sumA, sumB);
    }

    private boolean isSplittable(int index, int[] nums, int sumA, int sumB) {

        if (index >= nums.length) {
            return sumA == sumB;
        }

        if (nums[index] % 5 == 0) {
            return isSplittable(index + 1, nums, sumA + nums[index], sumB);
        }

        if (nums[index] % 3 == 0) {
            return isSplittable(index + 1, nums, sumA, sumB + nums[index]);
        }

        return  isSplittable(index + 1, nums, sumA + nums[index], sumB) || isSplittable(index + 1, nums, sumA, sumB + nums[index]);
    }

}
