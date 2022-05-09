package pl.ap_1;

public class ScoresAverage {

    public int scoresAverage(int[] scores) {

        int half = scores.length / 2;
        int sum1 = 0;
        int counter1 = 0;
        int sum2 = 0;
        int counter2 = 0;

        for (int i = 0; i < scores.length; i++) {
            if (i < half) {
                sum1 += scores[i];
                counter1++;
            } else {
                sum2 += scores[i];
                counter2++;
            }
        }
        return sum1 / counter1 > sum2 / counter2 ? sum1 / counter1 : sum2 / counter2;
    }

}
