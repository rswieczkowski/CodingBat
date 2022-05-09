package pl.array_1;

public class MaxTriple {
    public int maxTriple(int[] nums) {
        int start = nums[0];
        int middle = nums[nums.length / 2];
        int end = nums[nums.length - 1];

        return start > (middle > end ? middle : end)  ? start : (middle > end ? middle : end) ;
    }

}
