package pl.string_1;

public class HasBad {
    public boolean hasBad(String str) {
        if (str.length() < 3)
            return false;
        return str.substring(0, 3).equals("bad") || str.substring(0, 4).equals("bad");
    }

}
