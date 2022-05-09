package pl.logic_2;

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int med;

        if (a != max && a != min) {
            med = a;
        } else if (b != max && b != min) {
            med = b;
        } else {
            med = c;
        }

        return max - med == med - min;
    }

}
