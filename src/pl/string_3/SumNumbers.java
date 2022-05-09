package pl.string_3;

public class SumNumbers {
    public static int sumNumbers(String str) {
        int sum = 0;

        String number = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
                    number += str.charAt(i);
                } else {
                    number += str.charAt(i);
                    sum += Integer.parseInt(number);
                    number = "";
                }
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sumNumbers("aa11b33") );
    }

}
