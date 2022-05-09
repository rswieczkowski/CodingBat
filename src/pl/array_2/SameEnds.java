package pl.array_2;

public class SameEnds {
    public boolean sameEnds(int[] nums, int len) {
        for (int i = len - 1; i >= 0; i--) {
            if (nums[(len - 1) - i] != nums[(nums.length - 1) - i]) return false;
        }
        return true;
    }
}
