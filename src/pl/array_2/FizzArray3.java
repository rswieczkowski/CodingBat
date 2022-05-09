package pl.array_2;

public class FizzArray3 {

    public int[] fizzArray3(int start, int end) {

        int[] array = new int[end - start];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + start;
        }
        return array;
    }

}
