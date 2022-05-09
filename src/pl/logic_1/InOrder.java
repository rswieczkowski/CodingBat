package pl.logic_1;

public class InOrder {

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk)
            return c > b;
        return b > a && c > b;
    }

}
