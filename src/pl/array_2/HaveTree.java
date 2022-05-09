package pl.array_2;

public class HaveTree {

    public boolean haveThree(int[] nums) {
        if (nums.length < 5)
            return false;
        int countThree = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == 3 && nums[i + 1] != 3) {
                countThree++;
            } else if (i == nums.length - 1 && nums[i] == 3 && nums[i - 1] != 3)
                countThree++;
        }
        return countThree == 3;
    }

}
