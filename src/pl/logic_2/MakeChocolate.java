package pl.logic_2;

public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int a = (goal - 5 * big);
        if (a <= small && a >= 0) return a;
        if (a < 0 && goal % 5 <= small) return goal % 5;
        return -1;

    }

}
