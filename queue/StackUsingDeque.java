import java.util.*;

public class StackUsingDeque {
    static class Stack {
        Deque<Integer> stack = new ArrayDeque<>();

        public void push(int x) {
            stack.addLast(x);
        }

        public int pop() {
            if (stack.isEmpty())
                return -1;
            return stack.removeLast();
        }

        public int peek() {
            if (stack.isEmpty())
                return -1;
            return stack.getLast();
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

    }
}
