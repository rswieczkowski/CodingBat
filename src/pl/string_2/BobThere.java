package pl.string_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BobThere {
    public static boolean bobThere(String str) {
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("b.b");
        java.util.regex.Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static void main(String[] args) {
        System.out.println(bobThere("abcbb"));
    }

}
