package pl.array_3;

public class CountClumps {

    public static int countClumps(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length -1; i++) {
            if (i < nums.length - 2 && nums[i] == nums[i + 1] && nums[i] != nums[i + 2]) {
                count++;
            } else if (i == nums.length -2 && nums[i] == nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countClumps(new int[]{1, 1, 1, 1, 1}));
    }


}
