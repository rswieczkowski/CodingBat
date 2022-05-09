package pl.string_2;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        if (str.substring(n).contains(prefix)) {
            return true;
        }
        return false;
    }

}
