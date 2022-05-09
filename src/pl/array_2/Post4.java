package pl.array_2;

public class Post4 {

    public static int[] post4(int[] nums) {
        int[] newNums;
        int len = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 4) {
                count = i+1;
                len = nums.length - count;

            }
        }

        newNums = new int[len];
        for (int i = 0; i < newNums.length; i++) {
            newNums[i] = nums[i + count];
        }

        return newNums;
    }

    public static void main(String[] args) {
        post4(new int[] {2, 4, 1, 2});
    }

}
