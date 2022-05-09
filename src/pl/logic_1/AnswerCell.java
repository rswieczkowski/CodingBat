package pl.logic_1;

public class AnswerCell {
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep)
            return false;
        return !isMorning || isMom;
    }

    public static void main(String[] args) {
        System.out.println(answerCell(false, false, true));
    }
}
