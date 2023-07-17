public class UpdateIthBit {
    public static int updateAtGivePos(int n, int i, int newBit) {
        // cleared ith bit
        n = n & ~(1 << i);

        // set newBit at ith pos
        return n | (newBit << i);
    }

    public static void main(String[] args) {
        System.out.println(updateAtGivePos(10, 2, 1));
    }
}
