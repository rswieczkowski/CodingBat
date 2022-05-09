package pl.string_1;

public class LastChars {
    public String lastChars(String a, String b) {
        String begin;
        String end;

        if (a.isEmpty()) {
            begin = "@";
        } else {
            begin = a.substring(0, 1);
        }

        if (b.isEmpty()) {
            end = "@";
        } else {
            end = b.substring(b.length() - 1);
        }
        return begin + end;
    }

}
