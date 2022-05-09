package pl.array_2;

public class ZeroMax {
    public int[] zeroMax(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && i < nums.length - 1) {
                if (max == 0) {
                    for (int j = i; j < nums.length; j++) {
                        if ((nums[j] % 2) == 1 && nums[j] > max) {
                            max = nums[j];
                        }
                    }

                }
                nums[i] = max;
                max = 0;
            }

        }
        return nums;
    }
}
