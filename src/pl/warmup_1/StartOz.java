package pl.warmup_1;

public class StartOz {
    public String startOz(String str) {
        String s = "";
        if (!str.isEmpty() && str.charAt(0) == 'o') {
            s = s + "o";
        }
        if (str.length() > 1 && str.charAt(1) == 'z') {
            s = s + "z";
        }
        return s;
    }

}
