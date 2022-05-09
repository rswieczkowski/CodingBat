package pl.array_2;

public class TenRun {

    public int[] tenRun(int[] nums) {

        boolean ten = false;
        int digit = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 10 == 0) {
                digit = nums[i] / 10;
                ten = true;

            }
            if (ten) {
                nums[i] = digit * 10;
            }
        }
        return nums;
    }

}
