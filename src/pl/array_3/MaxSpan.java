package pl.array_3;

public class MaxSpan {

    public static int maxSpan(int[] nums) {
        int maxSpan = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && j - i + 1 > maxSpan) {
                    maxSpan = j - i + 1;
                }

            }
        }
        return maxSpan;
    }

    public static void main(String[] args) {
        maxSpan(new int[]{1, 2, 1, 1, 3});
    }

}
