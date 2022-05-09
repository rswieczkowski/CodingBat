package pl.logic_2;

public class LoneSum {
    public int loneSum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == b && a == c)
            return sum - a - b - c;
        if (a == b)
            return sum - a -b;
        if (a == c)
            return sum - a -c;
        if (b == c)
            return sum - b -c;
        return sum;
    }

}
