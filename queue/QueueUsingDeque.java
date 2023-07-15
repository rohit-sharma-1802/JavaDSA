import java.util.*;

public class QueueUsingDeque {
    static class Queue {
        Deque<Integer> queue = new ArrayDeque<>();

        public void add(int x) {
            queue.addLast(x);
        }

        public int remove() {
            if (queue.isEmpty())
                return -1;
            return queue.removeFirst();
        }

        public int peek() {
            if (queue.isEmpty())
                return -1;
            return queue.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());

    }

}