package pl.warmup_2;

public class SpringSplosion {
    public static String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0, i+1);
        }
        return result;
    }

}
