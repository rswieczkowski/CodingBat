package pl.string_3;

public class SameEnds {

    public static String sameEnds(String string) {

        String end = "";

        int j = string.length() - 1;

        for (int i = 0; i < string.length() / 2; i++) {
            if (string.substring(0, i + 1).equals(string.substring(j))) {
                end = string.substring(0, i + 1);
            }
            j--;

        }
        return end;
    }

    public static void main(String[] args) {

    }

}
