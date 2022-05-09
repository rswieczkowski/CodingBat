package pl.array_3;

public class MaxMirror {

    public static int maxMirror(int[] nums) {

        int count = 0;
        int start;
        int end;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    start = i;
                    end = j;
                    while (end >= 0 && start < nums.length && nums[start] == nums[end]) {
                        count++;
                        start++;
                        end--;
                    }
                    if(count > max) {
                        max = count;
                    }
                    count = 0;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxMirror(new int[] {1, 1, 1}));
    }
}
