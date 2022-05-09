package pl.warmup_1;

public class DelDel {
    public String delDel(String str) {
        if (!str.isEmpty() && str.substring(1).startsWith("del")) {
            str = str.replace("del", "");
        }
        return str;
    }

}
