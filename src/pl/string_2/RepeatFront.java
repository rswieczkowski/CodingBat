package pl.string_2;

public class RepeatFront {
    public static String repeatFront(String str, int n) {
        if (n == 0) {
            return "";
        }
        return str.substring(0, n) + repeatFront(str, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4));
    }

}
