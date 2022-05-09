package pl.warmup_2;

public class Has271 {
    public boolean has271(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] - 5 && nums[i + 2] >= nums[i] - 3 && nums[i + 2] <= nums[i] + 1) {
                return true;
            }
        }
        return false;
    }

}
