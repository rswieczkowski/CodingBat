package pl.warmup_1;

public class Max1020 {
    public int max1020(int a, int b) {
        boolean aRange = a >= 10 && a <= 20;
        boolean bRange = b >= 10 && b <= 20;
        if (!aRange && !bRange) {
            return 0;
        }
        if (aRange && !bRange) {
            return a;
        }
        if (!aRange) {
            return b;
        }
        return Math.max(a, b);

    }

}
