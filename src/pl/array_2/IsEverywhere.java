package pl.array_2;

public class IsEverywhere {

    public static boolean isEverywhere(int[] nums, int val) {

        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isEverywhere(new int[]{1, 2, 1, 3}, 1));
    }

}
