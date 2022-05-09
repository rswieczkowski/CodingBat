package pl.array_2;

public class FizzArray {
    public int[] fizzArray(int n) {
        int[] nums =  new int[n];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        return nums;
    }
}
