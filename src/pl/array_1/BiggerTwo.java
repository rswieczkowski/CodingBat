package pl.array_1;

public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < a.length; i++) {
            sumA += a[i];
            sumB += b[i];
        }
        if (sumA >= sumB)
            return a;
        return b;
    }

}
