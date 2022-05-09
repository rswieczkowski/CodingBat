package pl.recursion_2;

public class SplitOdd10 {

    public boolean splitOdd10(int[] nums) {

        int sumA = 0;
        int sumB = 0;
        int index = 0;

        return isOdd10(index, nums, sumA, sumB);
    }

    private boolean isOdd10(int index, int[] nums, int sumA, int sumB) {

        if(index >= nums.length) {
            return sumA % 10 == 0 && sumB % 2 != 0;
        }

        return isOdd10(index +1, nums, sumA + nums[index], sumB) || isOdd10(index +1, nums, sumA , sumB + nums[index]);
    }



}
