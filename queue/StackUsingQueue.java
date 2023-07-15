import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {
    static class Stack {
        Queue<Integer> a = new ArrayDeque<>();
        Queue<Integer> b = new ArrayDeque<>();

        public void push(int x) {
            if (!a.isEmpty())
                a.add(x);
            else if (!b.isEmpty())
                b.add(x);
            else
                a.add(x);
        }

        public int pop() {
            if (!a.isEmpty()) {
                while (a.size() > 1) {
                    b.add(a.remove());
                }
                return a.remove();
            } else if (!b.isEmpty()) {
                while (b.size() > 1) {
                    a.add(b.remove());
                }
                return b.remove();
            } else
                return -1;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

    }
}
