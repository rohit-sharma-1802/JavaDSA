import java.util.Stack;

public class QueueUsingStack {
    static class Queue {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();

        public void add(int x) {
            while (!a.isEmpty()) {
                b.push(a.pop());
            }
            a.push(x);
            while (!b.isEmpty()) {
                a.push(b.pop());
            }
        }

        public int remove() {
            if (a.isEmpty())
                return -1;
            else
                return a.pop();

        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        for (int i = 0; i < 2; i++) {
            System.out.println(q.remove());
        }
        q.add(40);
        q.add(50);
        for (int i = 0; i < 3; i++) {
            System.out.println(q.remove());
        }

    }
}
