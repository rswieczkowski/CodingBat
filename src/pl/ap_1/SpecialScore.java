package pl.ap_1;

public class SpecialScore {

    public int scoresSpecial(int[] a, int[] b) {

        return helper(a) + helper(b);

    }

    public int helper(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
        }
        return max;
    }

}
