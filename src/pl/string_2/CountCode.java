package pl.string_2;


public class CountCode {

    public int countCode(String str) {
        int count = 0;
        java.util.regex.Pattern code = java.util.regex.Pattern.compile("co.e");
        java.util.regex.Matcher m = code.matcher(str);
        while (m.find()) {
            count++;
        }
        return count;
    }

}
