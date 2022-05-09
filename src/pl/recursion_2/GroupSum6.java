package pl.recursion_2;

public class GroupSum6 {

    public static boolean groupSum6(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }

        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);
        }

        if(groupSum6(start + 1, nums, target - nums[start])) {
            return true;
        }

        return groupSum6(start + 1, nums, target);
    }
}
