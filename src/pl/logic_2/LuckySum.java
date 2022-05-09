package pl.logic_2;

public class LuckySum {
    public int luckySum(int a, int b, int c) {

        int sum = a + b + c;

        if (a == 13)
            sum = 0;
        if (b == 13)
            sum -= b - c;
        if(c ==13)
            sum -= c;
        return sum;


    }

}
