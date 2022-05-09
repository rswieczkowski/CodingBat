package pl.array_3;

public class Fix34 {

    public static int[] fix34(int[] nums) {
        int[] newNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                newNums[i] = 3;
                newNums[i + 1] = 4;
                nums[i] = 0;
            } else if (nums[i] == 4) {
                nums[i] = 0;
            }
        }
        int count = 0;
        for (int i = 0; i < newNums.length; i++) {
            if (nums[i] != 0) {
                if (newNums[count] != 3) {
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

    public static void main(String[] args) {
        fix34(new int[]{1, 3, 1, 4});
    }

}
