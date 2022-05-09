package pl.array_1;

public class MakeMiddle {

    public int[] makeMiddle(int[] nums) {
        int middleNums[] = new int[2];
        middleNums[0] = nums[nums.length / 2 - 1];
        middleNums[1] = nums[nums.length / 2];

        return middleNums;
    }

}
