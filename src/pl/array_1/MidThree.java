package pl.array_1;

public class MidThree {
    public int[] midThree(int[] nums) {
        int[] newArray = new int[3];
        int start = nums.length / 2 - 1;
        for (int i = 0; i < 3; i++) {
            newArray[i] = nums[start++];
        }
        return newArray;
    }

}
