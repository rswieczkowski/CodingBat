package pl.ap_1;

public class CopyEnd {

    public int[] copyEndy(int[] nums, int count) {

        int[] newArray = new int[count];

        for (int i = 0; i < nums.length; i++) {
            boolean endy = (nums[i] >= 0 && nums[i] <= 10) || (nums[i] >= 90 && nums[i] <= 100);
            if (endy) {
                newArray[newArray.length - count] = nums[i];
                count--;
                if (count == 0) {
                    break;
                }
            }

        }
        return newArray;
    }

}
