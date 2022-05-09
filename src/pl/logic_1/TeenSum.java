package pl.logic_1;

public class TeenSum {

    public int teenSum(int a, int b) {

        int sum = a + b;

        boolean extraLucky = a  >= 13 && a <= 19 || b  >= 13 && b <= 19;

        if (extraLucky) {
            sum = 19;
        }
        return sum;
    }
}
