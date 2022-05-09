package pl.string_2;

public class ZipZap {
    public static String zipZap(String str) {
        StringBuilder s = new StringBuilder();
        if (str.length() < 3)
            return str;
        for (int i = 0; i < str.length(); i++) {
            s.append(str.charAt(i));
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                i++;
            }

        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap") );
    }
}