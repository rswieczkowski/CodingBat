package pl.string_1;

public class MiddleThree {
    public String middleThree(String str) {
        int middle = str.length() / 2;
        return str.substring(middle -1, middle +2);

    }

}
