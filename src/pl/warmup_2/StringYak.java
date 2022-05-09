package pl.warmup_2;

public class StringYak {
    public String stringYak(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 2 && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
