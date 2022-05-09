package pl.array_2;

public class Without10 {

    public static int[] withoutTen(int[] nums) {
        int start = 0;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
            } else {
                nums[i] = 0;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        withoutTen(new int[] {1, 10, 10, 2});
    }

}
