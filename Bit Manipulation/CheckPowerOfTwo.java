public class CheckPowerOfTwo {
    public static void main(String[] args) {
        int x = 16;
        if ((x & (x - 1)) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not a power of 2");
        }
    }
}
