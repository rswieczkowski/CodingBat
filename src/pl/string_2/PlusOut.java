package pl.string_2;

public class PlusOut {
    public static String plusOut(String str, String word) {
        StringBuilder sb = new StringBuilder();
        int wLength = word.length();
        for (int i = 0; i < str.length(); i++) {
            if (i + wLength <= str.length() && str.substring(i, i + wLength).equals(word)) {
                sb.append(word);
                if (i <= str.length() - wLength)
                    i += wLength - 1;
            } else {
                sb.append("+");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
    }

}
