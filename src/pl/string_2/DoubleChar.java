package pl.string_2;

public class DoubleChar {
    public String doubleChar(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += "" + str.charAt(i) + str.charAt(i);
        }
        return newStr;
    }

}
