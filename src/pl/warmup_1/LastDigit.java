package pl.warmup_1;

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        int aReminder = a % 10;
        int bReminder = b % 10;
        return aReminder == bReminder;
    }

}
