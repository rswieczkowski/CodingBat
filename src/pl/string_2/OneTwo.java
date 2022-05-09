package pl.string_2;

public class OneTwo {

    public String oneTwo(String str) {

        int length = (str.length() / 3) * 3;
        char c;
        String s = "";

        for (int i = 0; i < length; i += 3) {
            c = str.charAt(i);
            for (int j = i + 1; j < i + 3; j++) {
                s += str.charAt(j);
            }
            s += c;
        }
        return s;
    }

}
