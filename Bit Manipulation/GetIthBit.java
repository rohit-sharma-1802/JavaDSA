public class GetIthBit {
    public static int getIthBit(int n, int i) {
        return (n & (1 << i)) == 0 ? 0 : 1;
    }

    public static void main(String[] args) {
        // int x = 13;
        // geting ith bit
        // System.out.println((15 << 3) & 15);
        System.out.println(getIthBit(15, 3));
    }

}
