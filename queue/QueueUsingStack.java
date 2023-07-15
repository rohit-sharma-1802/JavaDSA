import java.util.Stack;

public class QueueUsingStack {
    static class Queue {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();

        public void add(int x) {
            a.push(x); // O(1)
        }

        public int remove() {
            if (a.isEmpty() && b.isEmpty())
                return -1;
            if (!b.isEmpty())
                return b.pop();
            else {
                while (!a.isEmpty()) {
                    b.push(a.pop()); // O(N) removing
                }
                return b.pop();
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        for (int i = 0; i < 5; i++) {
            System.out.println(q.remove());
        }

    }
}
