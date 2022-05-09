package pl.warmup_1;

public class BackAround {
    public String backAround(String str) {
        char end = str.charAt(str.length() - 1);
        return end + str + end;
    }

}
