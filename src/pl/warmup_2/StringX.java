package pl.warmup_2;

public class StringX {
    public static String stringX(String str) {
//        String result = "";
//        if (str.length() <= 2) {
//            return str;
//        }
//        for (int i = 1; i < str.length() - 1; i++) {
//            if (str.charAt(i) != 'x') {
//                result += str.charAt(i);
//            }
//        }
//        return str.charAt(0) + result + str.charAt(str.length() - 1);
        String result = "";
        for (int i=0; i<str.length(); i++) {
            // Only append the char if it is not the "x" case
            if (!(i > 0 && i < (str.length()-1) && str.charAt(i) == 'x')) {
                result = result + str.charAt(i); // Could use str.charAt(i) here
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(stringX("xabxxxcdx"));
    }

}
