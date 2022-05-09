package pl.warmup_1;

public class FrontBack {
    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        char front = str.charAt(0);
        char back = str.charAt(str.length() - 1);
        return back + str.substring(1, str.length() - 1) + front;
    }

}
