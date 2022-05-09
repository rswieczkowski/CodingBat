package pl.logic_1;

public class DateFashion {
    public int dateFashion(int you, int date) {
        if (you >= 8 || date >= 8) {
            if (you <= 2 || date <= 2) {
                return 0;
            } else {
                return 2;
            }
        }
        return 1;
    }
}
