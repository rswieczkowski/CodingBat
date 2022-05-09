package pl.array_2;

public class ShiftLeft {

    public int[] shiftLeft(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        return nums;
    }

}
