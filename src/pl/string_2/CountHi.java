package pl.string_2;

public class CountHi {
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("hi"))
                count++;
        }
        return count;
    }
}
