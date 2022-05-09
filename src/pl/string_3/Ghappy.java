package pl.string_3;

import java.util.regex.Pattern;

public class Ghappy {

    public boolean gHappy(String str) {

        boolean happy = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i - 1) == 'g') {
                    happy = true;
                } else if (i < str.length() - 1 && str.charAt(i + 1) == 'g') {
                    happy = true;
                } else {
                    happy = false;
                }

            }
        }
        return happy;
    }

}
