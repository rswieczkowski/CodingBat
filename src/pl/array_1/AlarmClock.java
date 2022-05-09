package pl.array_1;

public class AlarmClock {
    public String alarmClock(int day, boolean vacation) {
        String seven = "7:00";
        String ten = "10:00";
        String off = "off";
        if ((vacation && (day >= 1 && day <= 5)) || (!vacation && (day == 0 || day == 6))) {
            return ten;
        } else if (!vacation) {
            return seven;
        }
        return off;
    }

}
