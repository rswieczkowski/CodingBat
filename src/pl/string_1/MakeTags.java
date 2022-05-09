package pl.string_1;

public class MakeTags {
    public String makeTags(String tag, String word) {
        String begin = "<" + tag + ">";
        String end = "</" + tag + ">";
        return begin + word + end;
    }

}
