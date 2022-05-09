package pl.logic_1;

import com.sun.jdi.PathSearchingVirtualMachine;

public class LoveSix {
    public boolean love6(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || a - b == 6 || b - a == 6;
    }

    public static void main(String[] args) {
        System.out.println(Math.abs(-7 - -1));
    }

}
