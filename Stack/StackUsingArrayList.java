package Stack;

import java.util.ArrayList;

public class StackUsingArrayList {
    public static class Stack {
        static ArrayList<Integer> stack = new ArrayList<>();
        public int size = 0;

        // isEmpty
        public boolean isEmpty() {
            return stack.size() == 0;
        }

        // push
        public void push(int x) {
            stack.add(x);
            size++;
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = stack.get(size - 1);
            stack.remove(size - 1);
            size--;
            return top;
        }

        // peek
        public int peek() {
            if (isEmpty())
                return -1;
            int top = stack.get(size - 1);
            return top;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        // st.push(10);
        // st.push(20);
        // st.push(30);

        System.out.println(st.peek());
        // System.out.println(st.peek());
        // System.out.println(st.pop());
        // System.out.println(st.peek());

    }
}
