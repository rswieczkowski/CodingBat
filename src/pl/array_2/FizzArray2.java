package pl.array_2;

public class FizzArray2 {

    public String[] fizzArray2(int n) {
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(i);
        }
        return array;
    }

}
