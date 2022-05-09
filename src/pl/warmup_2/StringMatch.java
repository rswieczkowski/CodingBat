package pl.warmup_2;

public class StringMatch {
    public static int stringMatch(String a, String b) {
        int length = a.length() > b.length() ? b.length() : a.length();
        int counter = 0;
        for (int i = 0; i < length - 2; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
    }

}
