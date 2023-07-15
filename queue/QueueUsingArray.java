public class QueueUsingArray {
    static class Queue {
        static int queue[];
        int size;
        static int front;
        static int rear;

        // initializing queue
        Queue(int size) {
            queue = new int[size];
            this.size = size;
            rear = 0;
            front = 0;
        }

        // enqueue operation
        void add(int x) {
            if (!isFull())
                queue[rear++] = x;
        }

        // dequeue operation
        int remove() {
            if (!isEmpty()) {
                int x = queue[front];
                for (int i = 0; i < rear; i++) {
                    queue[i] = queue[i + 1];
                }
                queue[rear] = 0;
                rear--;
                return x;
            }
            return -1;
        }

        // peek operation
        int peek() {
            return queue[front];
        }

        // check empty
        boolean isEmpty() {
            return queue.length == 0;
        }

        // check full
        boolean isFull() {
            return queue.length == rear;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}