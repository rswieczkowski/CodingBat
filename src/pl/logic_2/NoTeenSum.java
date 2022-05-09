package pl.logic_2;

public class NoTeenSum {

    public static int noTeenSum(int a, int b, int c) {
        a = fixTeen(a);
        b = fixTeen(b);
        c = fixTeen(c);
        int sum = a + b + c;
        return sum;
    }

    public static int fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            return 0;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(noTeenSum(2, 13, 1));
    }


}
