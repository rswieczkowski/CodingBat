package pl.logic_1;

public class NearTen {
    public boolean nearTen(int num) {

        int result = (num + 2) % 10;

        return result >= 0 & result <= 4;
    }

}
