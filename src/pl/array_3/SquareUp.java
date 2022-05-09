package pl.array_3;

import java.util.Arrays;

public class SquareUp {

    public static int[] squareUp(int n) {

        int[] array = new int[n * n];
        if (n == 0) {
            return array;
        }

        int stop = 1;
        for (int i = n - 1; i < array.length; i = i + n) {
            int num = 1;
            for (int j = i; j >= 0; j--) {
                array[j] = num;
                if (num == stop) {
                    stop++;
                    break;
                } else {
                    num++;
                }

            }
        }
        return array;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(squareUp(0)));
    }
}
