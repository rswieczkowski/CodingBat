package pl.logic_2;

public class BlackJack {
    public static int blackjack(int a, int b) {

        if (a > 21) {
            a = 0;
        }
        if (b > 21) {
            b = 0;
        }

        int diffA = Math.abs(21 - a); //2
        int diffB = Math.abs(21 - b); //1

        return diffA < diffB ? a : b;
    }

    public static void main(String[] args) {
        blackjack(19, 22);
    }

}
