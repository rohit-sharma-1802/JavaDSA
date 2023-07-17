public class IsOddOrEven {
    public static void main(String[] args) {
        int x = 34230;
        String res = (x & 1) == 0 ? "Even" : "Odd";
        System.out.println(res);
    }
}
