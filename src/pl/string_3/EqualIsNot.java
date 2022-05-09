package pl.string_3;

public class EqualIsNot {

    public boolean equalIsNot(String str) {

        String is = "is";
        String not = "not";

        int countIs = 0;
        int countNot = 0;

        for (int i = 0; i < str.length() - is.length() + 1; i++) {
            if (str.substring(i, i + is.length()).equals(is)) {
                countIs++;
            }
        }

        for (int i = 0; i < str.length() - not.length() + 1; i++) {
            if (str.substring(i, i + not.length()).equals(not)) {
                countNot++;
            }
        }
        return countIs == countNot;

    }

}
