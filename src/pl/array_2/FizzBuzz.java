package pl.array_2;

import java.util.Arrays;

public class FizzBuzz {

    public static String[] fizzBuzz(int start, int end) {

        int length = end - start;
        String[] array = new String[length];

        for (int i = 0; i < length; i++) {
            if ((start + i) % 3 == 0 && (start + i) % 5 == 0) {
                array[i] = "FizzBuzz";
            } else if ((start + i) % 3 == 0) {
                array[i] = "Fizz";
            } else if ((start + i) % 5 == 0) {
                array[i] = "Buzz";
            } else {
                array[i] = String.valueOf(i + start);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzz(50, 56)));
//                ["Buzz", "Fizz", "52", "53", "Fizz", "Buzz"]
    }

}
