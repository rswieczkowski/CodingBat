package pl.string_2;

public class SameStarChar {

    public boolean sameStarChar(String str) {

        boolean star = false;
        if (str.length() < 3)
            return true;

        if(!str.contains("*"))
            return true;

        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i < str.length() - 1) {
                if (str.charAt(i) == '*') {
                    if (str.charAt(i - 1) == str.charAt(i + 1)) {
                        star = true;
                    } else {
                        star = false;
                    }

                }
            }
        }
        return star;
    }


}
