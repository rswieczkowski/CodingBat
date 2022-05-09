package pl.logic_1;

public class LessThanTwenty {
    public boolean less20(int n) {
        return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
    }

    public static void main(String[] args) {
        System.out.println(1 % 1);
    }
}
