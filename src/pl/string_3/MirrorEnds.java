package pl.string_3;

public class MirrorEnds {
    public static String mirrorEnds(String string) {

        String result = "";
        int len = string.length();

        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == string.charAt(len-1-i))
                result += string.charAt(i);
            else
                return result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mirrorEnds("aba"));
    }

}
