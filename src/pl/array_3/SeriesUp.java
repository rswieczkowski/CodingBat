package pl.array_3;

public class SeriesUp {

    public int[] seriesUp(int n) {
        int len = n * (n + 1) / 2;
        int num = 0;
        int boundary = 1;

        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            num++;
            array[i] = num;
            if (num == boundary) {
                boundary++;
                num = 0;
            }
        }
        return array;

    }
}
