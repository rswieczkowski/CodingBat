package pl.logic_1;

public class BlueTicket {
    public int blueTicket(int a, int b, int c) {
        int sumAb = a + b;
        int sumAc = a + c;
        int sumBc = b + c;

        if (sumAb == 10 || sumAc == 10 || sumBc == 10) {
            return 10;
        }
        if (sumAb == sumAc + 10 || sumAb == sumBc + 10) {
            return 5;
        }
        return 0;
    }

}
