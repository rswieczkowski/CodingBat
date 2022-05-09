package pl.warmup_1;

public class Close10 {
    public int close10(int a, int b) {
        int aNum = Math.abs(10 - a);
        int bNum = Math.abs(10 - b);
        if (aNum == bNum) {
            return 0;
        }
        return aNum < bNum ? a : b;
    }

}
