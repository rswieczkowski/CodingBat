package pl.string_2;

public class WordEnds {
    public static String wordEnds(String str, String word) {
        int sLength = str.length();
        int wLength = word.length();
        StringBuilder sb = new StringBuilder();

        if (str.equals(word)) {
            return "";
        }

        for (int i = 0; i <= sLength - wLength; i++) {
            boolean equals = str.substring(i, i + wLength).equals(word);
            if (i == 0 && equals) {
                sb.append(str.charAt(i + wLength));
            } else if (i == sLength - wLength && equals) {
                sb.append(str.charAt(i - 1));
            } else if (equals) {
                sb.append(str.charAt(i - 1));
                sb.append(str.charAt(i + wLength));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(wordEnds("3XY", "XY"));
    }

}
