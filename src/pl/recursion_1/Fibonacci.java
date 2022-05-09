package pl.recursion_1;

public class Fibonacci {

    public static int fibonacci(int n) {
        System.out.println( "\nInput value: " + n );
        if (n == 0 || n == 1) {
            System.out.println( "Terminating block value: " + n );
            return n;
        } else {
            System.out.println( "Recursion block value: fibonacci(" + (n - 1) + ") + fibonacci(" + (n - 2) + ")" );
            int result = fibonacci( n - 1 ) + fibonacci( n - 2 );
            System.out.println( "Recursion block return value: " + result );
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.print(fibonacci(4) + " ");
    }
}
