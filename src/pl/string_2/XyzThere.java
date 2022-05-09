package pl.string_2;

public class XyzThere {
    public boolean xyzThere(String str) {

        String newString = str.replaceAll("\\.xyz", "");

        return newString.contains("xyz");

    }

}
