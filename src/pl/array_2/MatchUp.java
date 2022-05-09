package pl.array_2;

public class MatchUp {

    private int matchUp(int[] num1, int[] num2) {
        int counter = 0;
        for(int i = 0 ; i < num1.length; i++) {
            boolean differ = Math.abs(num1[i] - num2[i]) > 0 && Math.abs(num1[i] - num2[i]) <= 2;
            if(differ)
                counter++;
        }
        return counter;
    }
}
