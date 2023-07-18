package Recursion;

public class FriendsPair {
    public static int makePair(int n) {
        return n == 1 || n == 2 ? n : makePair(n - 1) + makePair(n - 2) * (n - 1);
    }

    public static void main(String[] args) {
        System.out.println(makePair(3));
    }
}
