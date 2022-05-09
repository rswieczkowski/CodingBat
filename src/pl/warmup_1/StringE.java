package pl.warmup_1;

public class StringE {
    public boolean stringE(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                counter++;
            }
        }
        return counter > 0 && counter <= 3;
    }

}
