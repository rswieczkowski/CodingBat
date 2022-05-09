package pl.string_3;

public class IsNot {

    public static String notReplace(String str) {
        String replaced = "";

        if (str.length() == 2 && str.equals("is")) {
            return "is not";
        }

        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i < str.length() - 2 && str.substring(i, i + 2).equals("is") && !Character.isLetter(str.charAt(i + 2)) && !Character.isLetter(str.charAt(i - 1))) {
                replaced += "is not";
                i++;
            } else if (i == 0 && str.substring(i, i + 2).equals("is") && !Character.isLetter(str.charAt(i + 2))) {
                replaced += "is not";
                i++;
            } else if (i == str.length() - 2 && str.substring(i, i + 2).equals("is") && !Character.isLetter(str.charAt(i - 1))) {
                replaced += "is not";
                i++;
            } else {
                replaced += str.charAt(i);
            }
        }
        return replaced;
    }

    public static void main(String[] args) {
        System.out.println(notReplace("is test"));
    }

}
