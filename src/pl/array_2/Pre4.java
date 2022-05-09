package pl.array_2;

public class Pre4 {

    public static int[] pre4(int[] nums) {

        int[] newNums;
        int len = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 4) {
                len = i;
                break;
            }
        }
        newNums = new int[len];
        for (int i = 0; i < newNums.length; i++) {
            newNums[i] = nums[i];
        }

        return newNums;
    }

    public static void main(String[] args) {
        System.out.println(pre4(new int[]{1, 2, 4, 1}));
    }

}
