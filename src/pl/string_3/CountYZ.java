package pl.string_3;

import java.util.Arrays;

public class CountYZ {
    public static int countYZ(String str) {
        String[] array = str.toLowerCase().split("[^a-zA-Z]");
        int count = 0;
        for (String s : array) {
            if (!s.isEmpty() && (s.charAt(s.length() - 1) == 'y' || (s.charAt(s.length() - 1) == 'z'))) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countYZ("DAY abc XYZ"));
    }

}
