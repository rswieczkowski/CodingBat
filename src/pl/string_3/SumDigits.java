package pl.string_3;

public class SumDigits {

    public static int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).matches("[0-9]")) {
                sum += Integer.parseInt(str.substring(i, i + 1));
            }
        }
        return sum;
    }

    public static void main(String[] args) {

    }

}
