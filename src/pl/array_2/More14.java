package pl.array_2;

public class More14 {
    public boolean more14(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                counter++;
            if (nums[i] == 4)
                counter--;
        }
        return counter > 0;
    }

}
