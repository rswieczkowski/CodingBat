package pl.string_1;

public class ComboString {
    public String comboString(String a, String b) {
        if (a.length() < b.length())
            return a + b + a;
        return b + a + b;
    }

}
