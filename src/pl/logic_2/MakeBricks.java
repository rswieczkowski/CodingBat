package pl.logic_2;

public class MakeBricks {
    public static boolean makeBricks(int small, int big, int goal) {
        if (small + big * 5 < goal)
            return false;
        if (goal % 5 > small)
            return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(makeBricks(3, 2, 9));
    }

}
