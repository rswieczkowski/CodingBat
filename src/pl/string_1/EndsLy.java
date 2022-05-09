package pl.string_1;

public class EndsLy {
    public boolean endsLy(String str) {
        return str.substring(str.length() - 2).equals("ly");
    }

}
