package pl.string_1;

public class AtFirst {
    public String atFirst(String str) {
        if (str.isEmpty())
            return "@@";
        if (str.length() == 1)
            return str + "@";
        return str.substring(0, 2);
    }

}
