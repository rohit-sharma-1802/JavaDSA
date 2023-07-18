package Recursion;

public class PowOfX {
    public static int pow(int x, int n) {
        // if (n == 1)
        // return x;
        // return x * pow(x, n - 1);

        if (n == 0)
            return 1;
        int a = pow(x, n / 2);
        int pw = a * a;

        if (n % 2 != 0)
            pw = x * pw;
        return pw;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 31));
    }
}
