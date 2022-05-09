package pl.string_2;

public class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < count; i++) {
            s.append(word);
            if (i < count - 1) {
                s.append(sep);
            }

        }
        return s.toString();
    }

}
