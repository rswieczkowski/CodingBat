package pl.ap_1;

public class DividesSelf {

    public static boolean dividesSelf(int n) {

        int number = n;
        int divider;

        while (number > 0) {
            divider = number % 10;
            if ( divider == 0 || n % divider != 0) {
                return false;
            } else {
                number /= 10;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(dividesSelf(32));
    }

}
