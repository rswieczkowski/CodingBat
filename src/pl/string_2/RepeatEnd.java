package pl.string_2;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        StringBuilder s = new StringBuilder();
        int end = str.length() - n;

        for (int i = 0; i < n; i++) {
            s.append(str.substring(end));

        }
        return s.toString();
    }

}
