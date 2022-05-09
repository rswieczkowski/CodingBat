package pl.array_1;

public class Front11 {
    public int[] front11(int[] a, int[] b) {
        int[] newArray;
        if (a.length == 0 && b.length == 0) {
            newArray = new int[0];
        } else if (a.length > 0 && b.length > 0) {
            newArray = new int[2];
            newArray[0] = a[0];
            newArray[1] = b[0];
        } else if (a.length == 0) {
            newArray = new int[1];
            newArray[0] = b[0];
        } else {
            newArray = new int[1];
            newArray[0] = a[0];
        }
        return newArray;
    }

}
