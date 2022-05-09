package pl.string_1;

public class WithoutX2 {
    public String withoutX2(String str) {
        if (str.length() <= 1) return "";
        String rest = str.substring(2);
        String first = str.substring(0, 1).equals("x") ? "" : str.substring(0, 1);
        String second = str.substring(1, 2).equals("x") ? "" : str.substring(1, 2);
        return first + second + rest;
    }

}
