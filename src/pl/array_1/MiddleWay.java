package pl.array_1;

public class MiddleWay {
    public int[] middleWay(int[] a, int[] b) {
        int middle = a.length / 2;
        return new int[]{a[middle], b[middle]};
    }

}
