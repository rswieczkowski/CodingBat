package pl.array_2;

public class Has12 {


    public boolean has12(int[] nums) {
        boolean one = false;
        boolean two = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                one = true;
            }
            if (one && nums[i] == 2) {
                two = true;
            }

        }
        return one && two;
    }

}
