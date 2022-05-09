package pl.logic_2;

public class CloseFar {
    public boolean closeFar(int a, int b, int c) {
        return !close(b,c)&(close(a,b)^close(a,c));
    }
    public boolean close(int a, int b) {
        return Math.abs(a-b)<=1;
    }

}
