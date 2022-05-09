package pl.ap_1;

public class CopyEvens {

    public int[] copyEvens(int[] nums, int count) {

        int[] newNums = new int[count];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                newNums[counter] = nums[i];
                counter++;
                if (count == counter) {
                    break;
                }

            }
        }
        return newNums;
    }

}
