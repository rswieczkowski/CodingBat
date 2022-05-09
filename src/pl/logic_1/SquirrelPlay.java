package pl.logic_1;

public class SquirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        boolean tempRange = temp >= 60 && temp <= 90;
        if (isSummer) {
            tempRange = temp >= 60 && temp <= 100;
        }
        return tempRange;
    }

}
