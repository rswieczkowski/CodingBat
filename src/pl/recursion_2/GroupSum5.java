package pl.recursion_2;

public class GroupSum5 {

    public static boolean groupSum5(int start, int[] nums, int target) {

        if (start >= nums.length) {
            return target == 0;
        }

        if (nums[start] % 5 == 0) {
            if (start < (nums.length - 1) && nums[start + 1] != 1) {
                return groupSum5(start + 1, nums, target - nums[start]);
            }
            return groupSum5(start + 2, nums, target - nums[start]);
        }

        if (groupSum5(start + 1, nums, target - nums[start])) {
            return true;
        }

        return groupSum5(start + 1, nums, target);
    }

    public static void main(String[] args) {
        System.out.println(groupSum5(0, new int[]{3, 5, 1}, 9));
    }

}
