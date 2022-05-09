package pl.string_1;

public class Middle2 {
    public String middleTwo(String str) {
        int middle = str.length() / 2;
        return str.length() > 2 ? str.substring(middle - 1, middle + 1) : str;
    }

}
