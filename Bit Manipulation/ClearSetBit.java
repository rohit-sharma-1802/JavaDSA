public class ClearSetBit {
    public static int clearSetBit(int n, int i) {
        return (n & ~(1 << i));
    }

    public static void main(String[] args) {
        System.out.println(clearSetBit(10, 1));

    }
}
