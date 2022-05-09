package pl.array_1;

public class PlusTwo {
    public int[] plusTwo(int[] a, int[] b) {
        int[] newArray = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
            newArray[newArray.length / 2 + i] = b[i];
        }
        return newArray;
    }

}
