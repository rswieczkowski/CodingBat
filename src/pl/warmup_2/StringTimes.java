package pl.warmup_2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        if (n == 0)
            return "";
        if (n == 1)
            return str;
        return str + stringTimes(str, n - 1);
    }

}
