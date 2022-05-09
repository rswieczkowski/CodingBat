package pl.array_2;

public class TwoTwo {
    public boolean twoTwo(int[] nums) {

        int len = nums.length;
        boolean result = true;
        boolean found = false;

        for (int i = 0; i < len; i++) {
            if (nums[i] != 2) found = false;

            if (nums[i] == 2 && found) result = true;

            if (nums[i] == 2 && !found) {
                found = true;
                result = false;
            }

        }
        return result;
    }

}
