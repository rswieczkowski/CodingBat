package pl.string_1;

public class StartWord {
    public String startWord(String str, String word) {
        if (word.length() <= str.length() && word.substring(1).equals(str.substring(1, word.length()))) {
            return str.substring(0, word.length());
        }
        return "";
    }

}
