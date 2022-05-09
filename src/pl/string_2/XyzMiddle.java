package pl.string_2;

public class XyzMiddle {
    public boolean xyzMiddle(String str) {
        for (int i = 0; i <= str.length() - 3; i++)
            if (str.startsWith("xyz", i) &&
                    Math.abs(str.length() - i - 3 - i) <= 1) return true;
        return false;
    }

}
