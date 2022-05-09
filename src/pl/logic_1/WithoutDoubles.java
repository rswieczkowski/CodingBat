package pl.logic_1;

public class WithoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = die1 + die2;
        if (noDoubles && die1 == die2) {
            if (sum == 12) {
                sum = 7;
            } else {
                sum++;
            }
        }
        return sum;
    }

}
