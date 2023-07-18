
public class FastExponent {
    public static int fastExponent(int a, int n) {
        int ans;
        for (ans = 1; n > 0; n = n >> 1, a *= a)
            ans = (n & 1) != 0 ? ans * a : ans;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExponent(2, 5));
    }
}