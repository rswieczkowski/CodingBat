package pl.string_3;

public class WithoutString {

    public String withoutString(String base, String remove) {
//        for (int i = 0; i < base.length() - remove.length(); i++) {
//            if(base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
//                base = base.re
//            }
//        }
        String result = base.replaceAll("(?i)"+ remove, "");

        return result;
    }


}
