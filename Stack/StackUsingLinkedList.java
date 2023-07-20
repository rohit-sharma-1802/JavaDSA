package Stack;

public class StackUsingLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;

        // isEmpty
        public boolean isEmpty() {
            return head == null;
        }

        // push
        public void push(int x) {
            if (isEmpty()) {
                head = new Node(x);
                return;
            }

            Node newNode = new Node(x);
            newNode.next = head;
            head = newNode;
        }

        // pop()
        public int pop() {
            if (head == null)
                return -1;
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek()
        public int peek() {
            if (head == null)
                return -1;
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }

    }

}
