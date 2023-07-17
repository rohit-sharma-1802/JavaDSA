public class ClearLastIBits {
    public static int clearLastIBits(int n, int i) {
        return (n & (-1 << i));
    }

    public static void main(String[] args) {
        System.out.println(clearLastIBits(15, 2));
    }
}