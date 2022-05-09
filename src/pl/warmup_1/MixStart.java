package pl.warmup_1;

public class MixStart {
    public boolean mixStart(String str) {
        return !str.isEmpty() && str.substring(1).startsWith("ix");
    }
}
