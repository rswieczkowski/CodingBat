package pl.string_1;

public class MinCat {
    public String minCat(String a, String b) {
        int difference = Math.min(a.length(), b.length());
        return a.length() >= b.length() ? a.substring(a.length() - difference) + b : a + b.substring(b.length() - difference);
    }

}
