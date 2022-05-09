package pl.array_1;

public class MakeLast {
    public int[] makeLast(int[] nums) {
        int[] newArray = new int[nums.length];
        newArray[newArray.length - 1] = nums[nums.length - 1];
        return newArray;
    }

}
