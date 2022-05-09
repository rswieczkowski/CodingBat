package pl.logic_1;

public class SumLimit {
    public int sumLimit(int a, int b) {
        int sum = a + b;

        String aString = String.valueOf(a);
        String sumString = String.valueOf(sum);

        if (aString.length() == sumString.length()) {
            return sum;
        } else {
            return a;
        }

    }

}
