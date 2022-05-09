package pl.array_2;

public class EvenOdd {

    public int[] evenOdd(int[] nums) {
        int[] newArray = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                newArray[start] = nums[i];
                start++;
            } else {
                newArray[end] = nums[i];
                end--;
            }
        }
        return newArray;
    }

}
