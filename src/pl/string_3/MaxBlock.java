package pl.string_3;

public class MaxBlock {
    public static int maxBlock(String str) {

        int counter = 1;
        int max = 0;

        if (str.isEmpty())
            return max;

        for (int i = 0; i < str.length() - 1; i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > max)
                max = counter;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxBlock("xyzz"));
    }

}
