import java.util.*;

public class ReversalOfQueue {

    public static Queue<Integer> reverse(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty())
            st.push(q.remove());
        while (!st.isEmpty())
            q.add(st.pop());
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(reverse(q));
    }
}
