package pl.warmup_2;

public class StringBits {
    public String stringBits(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        return "" + str.charAt(0) + stringBits(str.substring(2));
    }
}
