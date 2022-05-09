package pl.logic_2;

public class RoundSum {

    public int roundSum(int a, int b, int c) {
        int roundA = round10(a);
        int roundB = round10(b);
        int roundC = round10(c);

        return roundA + roundB + roundC;
    }

    public int round10(int num) {
        if (num < 5)
            return 0;
        if (num <= 9)
            return 10;
        if (num % 10 < 5)
            return num - (num % 10);
        return num - (num % 10) + 10;
    }

}
