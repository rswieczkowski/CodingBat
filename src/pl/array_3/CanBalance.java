package pl.array_3;

public class CanBalance {

    public static boolean canBalance(int[] nums) {

        int sum1 = 0;
        int sum2 = 0;


        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum2 += nums[j];
            }
            if (sum1 == sum2) {
                return true;
            }
            sum2 = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canBalance(new int []{1, 1, 1, 2, 1}));
    }

}
