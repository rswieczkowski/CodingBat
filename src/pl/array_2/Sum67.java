package pl.array_2;

public class Sum67 {

    public int sum67(int[] nums) {
        int sum = 0;
        boolean not67 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6)
                not67 = true;
            else if (!not67)
                sum += nums[i];
            else if (nums[i] == 7)
                not67 = false;
        }
        return sum;
    }

}
