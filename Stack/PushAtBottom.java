package Stack;

import java.util.Stack;

public class PushAtBottom {
    public static void pushAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        pushAtBottom(st, 10);
        pushAtBottom(st, 20);
        pushAtBottom(st, 30);
        pushAtBottom(st, 40);

        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
