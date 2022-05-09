package pl.string_1;

public class WithoutX {
    public String withoutX(String str) {
        if (str.length() <= 1) return "";
        String middle = str.substring(1, str.length() - 1);
        String first = str.substring(0, 1).equals("x") ? "" : str.substring(0, 1);
        String last = str.substring(str.length() - 1).equals("x") ? "" : str.substring(str.length() - 1);
        return first + middle + last;
    }

}
