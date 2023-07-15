public class QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static class Queue {
        Node front = null;
        Node rear = null;

        // isEmpty
        public boolean isEmpty() {
            return front == null && rear == null;
        }

        // add operation
        public void add(int x) {
            Node newNode = new Node(x);
            if (front == null) {
                front = newNode;
                rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        // remove;
        public int remove() {
            if (isEmpty()) {

                return -1;
            }
            int x = front.data;
            if (front == rear) {
                front = rear = null;
            } else {
                front = front.next;
            }
            return x;
        }

        // peek
        public int peek() {
            return front.data;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        for (int i = 0; i < 5; i++) {
            System.out.println(q.peek());
        }
    }
}
