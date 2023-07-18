package Recursion;

public class Fibonacci {
    public static int fib(int n) {
        if (n == 1)
            return 1;
        if (n == 0)
            return 0;
        return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(13));
    }
}
