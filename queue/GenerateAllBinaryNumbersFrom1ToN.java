import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Queue;
// import java.util.Stack;
import java.util.ArrayList;

public class GenerateAllBinaryNumbersFrom1ToN {
    public static ArrayList<String> generateBinary(int n) {
        Queue<String> q = new ArrayDeque<>(n);
        ArrayList<String> res = new ArrayList<>();

        // for (int i = 1; i <= n; i++) {
        // int a = i;
        // Stack<Integer> st = new Stack<>();
        // while (a != 0) {
        // st.push(a % 2);
        // a /= 2;
        // }
        // StringBuilder res = new StringBuilder();
        // while (!st.isEmpty()) {
        // res.append(st.pop());
        // }
        // list.add(new String(res));
        // }

        q.add("1");
        for (int i = 1; i <= n; i++) {
            String s1 = q.remove();
            res.add(s1);
            String s2 = s1;
            q.add(s1 + '0');
            q.add(s2 + '1');
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(generateBinary(sc.nextInt()));
        sc.close();
    }
}
