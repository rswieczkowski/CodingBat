package pl.recursion_2;

public class GroupSum {

    public static boolean groupSum(int start, int[] nums, int target) {

        if (start >= nums.length) {
            return target == 0;
        }

        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }

        return groupSum(start + 1, nums, target);
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3};
        System.out.println(groupSum(0, nums, 7));
    }
}
