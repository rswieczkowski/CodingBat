package pl.warmup_1;

public class NotString {

    public static String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        return "not " + str;
    }

}
