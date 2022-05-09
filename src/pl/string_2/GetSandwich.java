package pl.string_2;

public class GetSandwich {
    public static String getSandwich(String str) {

        String bread = "bread";

        for (int i = 0; i < str.length() - 4; i++) {
            if (str.substring(i, i + 5).equals(bread)) {
                str = str.substring(i + 5);
                break;
            }
        }
        if (str.length() < 5) {
            return "";
        }
        for (int i = str.length(); i > 5; i--) {
            if (str.substring(i - 5, i).equals(bread)) {
                str = str.substring(0, i - 5);
                return str;
            }
        }
       return "";
    }

    public static void main(String[] args) {
        System.out.println(getSandwich("abcbreaz"));
    }

}
