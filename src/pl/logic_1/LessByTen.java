package pl.logic_1;

public class LessByTen {
    public boolean lessBy10(int a, int b, int c) {
        return a <= b - 10 || a <= c - 10 || b <= c - 10 || b <= a - 10 || c <= a - 10 || c <= b - 10;
    }

}
