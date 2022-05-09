package pl.array_2;

public class ZeroFront {

    public static int[] zeroFront(int[] nums) {
        int temp;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                i = start;
                start++;

            }

        }
        return nums;
    }

    public static void main(String[] args) {

        zeroFront(new int[]{1, 0, 0, 1});
    }

}
