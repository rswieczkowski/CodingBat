package pl.warmup_2;

public class Last2 {
    public static int last2(String str) {
        int counter = 0;
        if (str.length() <= 2) {
            return 0;
        }
        String end = str.substring(str.length() - 2);
        for (int i = 0; i < str.length() - 2; i++) {
            if (end.equals(str.substring(i, i + 2))) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {


    }
}
