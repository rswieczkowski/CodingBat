package pl.warmup_2;

public class FrontTimes {
    public static String frontTimes(String str, int n) {
        if (n == 0) {
            return "";
        }
        if (str.length() <= 3)
            return str + frontTimes(str, n - 1);
        String front = str.substring(0, 3);
        return front + frontTimes(str, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(frontTimes("Abc", 3));
    }

}
