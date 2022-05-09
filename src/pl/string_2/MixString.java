package pl.string_2;

public class MixString {
    public String mixString(String a, String b) {
        StringBuilder s = new StringBuilder();
        int length = a.length() <= b.length() ? a.length() : b.length();
        for (int i = 0; i < length; i++) {
            s.append(a.charAt(i)).append(b.charAt(i));
        }

        String rest = a.length() > b.length() ? a.substring(length) : b.substring(length);

        return s + rest;
    }

}
