package pl.ap_1;

public class MergeTwo {

    public String[] mergeTwo(String[] a, String[] b, int n) {

        String[] result = new String[n];

        int aCounter = 0;
        int bCounter = 0;

        for (int i = 0; i < result.length; i++) {
            if (a[aCounter].compareTo(b[bCounter]) < 0) {
                result[i] = a[aCounter];
                aCounter++;
            } else if (a[aCounter].compareTo(b[bCounter]) == 0) {
                result[i] = a[aCounter];
                aCounter++;
                bCounter++;
            } else {
                result[i] = b[bCounter];
                bCounter++;
            }
        }

        return result;

    }

}
