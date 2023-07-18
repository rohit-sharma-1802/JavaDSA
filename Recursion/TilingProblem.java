package Recursion;

public class TilingProblem {
    public static int totalWaysOfTiling(int n) {
        return n == 0 || n == 1 ? 1 : totalWaysOfTiling(n - 1) + totalWaysOfTiling(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(totalWaysOfTiling(4));
    }
}
