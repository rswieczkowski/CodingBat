package pl.string_2;

public class StarOut {
    public static String starOut(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();

        if (length <= 3 && str.contains("*"))
            return "";
        if (length <= 3)
            return str;

        for (int i = 0; i < length; i++) {
            if (i == 0 && str.charAt(i) != '*' && str.charAt(i + 1) != '*') {
                sb.append(str.charAt(i));
            } else if (i == length - 1 && str.charAt(i) != '*') {
                sb.append(str.charAt(i));

            } else if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*' && str.charAt(i + 1) != '*') {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(starOut("a*bc"));
    }
}
