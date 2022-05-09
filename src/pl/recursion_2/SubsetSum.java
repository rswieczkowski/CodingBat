package pl.recursion_2;

public class SubsetSum {

    public static boolean isSubsetSum(int set[], int n, int sum) {
        if (sum == 0) {
            return true;
        }

        if (isSubsetSum(set, n - 1, sum - set[n])) {
            return true;
        }

        if (isSubsetSum(set, n - 1, sum)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(isSubsetSum(nums, nums.length - 1, 10));
    }


}
