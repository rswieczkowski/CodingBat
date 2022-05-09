package pl.warmup_1;

public class EveryNth {
    public static String everyNth(String str, int n) {
        if(n >= str.length())
            return "" + str.charAt(0);
        return "" + str.charAt(0) + everyNth(str.substring(n),n);
    }

    public static void main(String[] args) {
        System.out.println(everyNth("Miracle",2));
    }

}
