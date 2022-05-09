package pl.string_2;

public class EndOfOther {
    public boolean endOther(String a, String b) {

        int aLength = a.length();
        int bLength = b.length();

        return aLength >= bLength ? a.substring(aLength - bLength).equalsIgnoreCase(b) : b.substring(bLength - aLength).equalsIgnoreCase(a);

    }
}
