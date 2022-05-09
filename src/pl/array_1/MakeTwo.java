package pl.array_1;

public class MakeTwo {
    public int[] make2(int[] a, int[] b) {
        int[] newArray = new int[2];

        for (int i = 0; i < (a.length < newArray.length ? a.length : newArray.length); i++) {
            newArray[i] = a[i];
        }
        int start = 0;
        for (int i = a.length; i < newArray.length; i++) {
            newArray[i] = b[start++];
        }
        return newArray;
    }

}
