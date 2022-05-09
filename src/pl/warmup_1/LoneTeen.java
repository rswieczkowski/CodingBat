package pl.warmup_1;

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        boolean isATeen = a >= 13 && a <= 19;
        boolean isBTeen = b >= 13 && b <= 19;
        if (isATeen && isBTeen) {
            return false;
        }
        return isATeen || isBTeen;
    }

}
