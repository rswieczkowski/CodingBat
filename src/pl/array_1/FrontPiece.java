package pl.array_1;

public class FrontPiece {
    public int[] frontPiece(int[] nums) {
        int newArrayLength = nums.length < 2 ? nums.length : 2;
        int[] newArray = new int[newArrayLength];
        for (int i = 0; i < newArrayLength; i++) {
            newArray[i] = nums[i];
        }
        return newArray;
    }

}
