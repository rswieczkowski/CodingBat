package pl.string_2;

public class XyBalance {
    public boolean xyBalance(String str) {

        boolean xBalanced = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                xBalanced = false;
            } else if (str.charAt(i) == 'y') {
                xBalanced = true;
            }
        }
        return xBalanced;
    }

}
