package pl.recursion_2;

public class GroupNoAdj {

    public static boolean groupNoAdj(int start, int[] nums, int target) {

        if (start >= nums.length) {
            return target == 0;
        }

        if (groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        groupNoAdj(0, new int[]{2, 5, 10, 4}, 12);
    }

}
