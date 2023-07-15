public class CircularQueue {

    static class CQueue {
        int cq[];
        int size;
        int front;
        int rear;

        CQueue(int s) {
            size = s;
            cq = new int[s];
            front = rear = -1;
        }

        // add operation
        public void add(int x) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1)
                front = 0;
            rear = (rear + 1) % size;
            cq[rear] = x;
        }

        // remove operation
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = cq[front];

            if (front == rear)
                front = rear = -1;
            else
                front = (front + 1) % size;

            return result;
        }

        // peek operation
        public int peek() {
            return cq[front];
        }

        // isFull operation
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // isEmpty operation
        public boolean isEmpty() {
            return front == -1 && rear == -1;
        }
    }

    public static void main(String[] args) {
        CQueue cq = new CQueue(3);
        cq.add(10);
        cq.add(20);
        cq.add(30);
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        cq.add(40);
        cq.add(50);
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        System.out.println(cq.remove());
    }
}