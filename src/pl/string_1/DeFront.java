package pl.string_1;

public class DeFront {
    public String deFront(String str) {
        String s;

        if (str.charAt(0) != 'a' && str.charAt(1) != 'b') {
            s = str.substring(2);
        } else if (str.charAt(0) == 'a' && str.charAt(1) != 'b') {
            s = str.charAt(0) + str.substring(2);
        } else if (str.charAt(0) != 'a' && str.charAt(1) == 'b') {
            s = str.substring(1);
        } else {
            s = str;
        }
        return s;
    }

}
