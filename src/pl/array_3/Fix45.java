package pl.array_3;

public class Fix45 {

    public int[] fix45(int[] nums) {
        int[] newNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                newNums[i] = 4;
                newNums[i + 1] = 5;
                nums[i] = 0;
            } else if (nums[i] == 5) {
                nums[i] = 0;
            }
        }
        int count = 0;
        for (int i = 0; i < newNums.length; i++) {
            if (nums[i] != 0) {
                if (newNums[count] != 4) {
                    newNums[count] = nums[i];
                    count++;
                } else {
                    count += 2;
                    i--;
                }
            }
        }
        return newNums;
    }

}
