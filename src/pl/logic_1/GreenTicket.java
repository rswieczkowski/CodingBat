package pl.logic_1;

public class GreenTicket {
    public int greenTicket(int a, int b, int c) {
        if (a == b && c == b) {
            return 20;
        }
        if (a == b || c == b || a == c) {
            return 10;
        }
        return 0;
    }

}
