public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public int size = 0;

    // Methods
    // add first
    public void addFirst(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // add last
    public void addLast(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // insert at given pos
    public void insert(int x, int i) {
        int count = 0;
        Node curr = head;
        Node newNode = new Node(x);
        while (curr != tail && count != i - 1) {
            curr = curr.next;
            count++;
        }
        if (count == i - 1) {
            newNode.next = curr.next;
            curr.next = newNode;
            size++;
        }
    }

    public int search(int x) {
        // if (head == null)
        // return -1;
        // Node curr = head;
        // int i = 0;
        // while (curr != null) {
        // if (curr.data == x)
        // return i;
        // i++;
        // curr = curr.next;
        // }
        // return -1;
        return searchRec(x, head, 0);
    }

    public int searchRec(int x, Node curr, int i) {
        if (curr == null)
            return -1;
        if (curr.data == x)
            return i;
        return searchRec(x, curr.next, ++i);
    }

    // print a linkedList
    public void print() {
        Node curr = head;
        while (curr != tail.next) {
            System.out.print(curr.data);
            if (curr != tail) {
                System.out.print(" -> ");
            } else {
                System.out.println();
            }
            curr = curr.next;
        }
    }

    // remove first
    public void removeFirst() {
        if (head == null)
            return;
        if (size == 1) {
            size = 0;
            head = tail = null;
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (head == null)
            return;
        else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        } else {
            Node curr = head;
            while (curr.next != tail) {
                curr = curr.next;
            }
            curr.next = null;
            tail = curr;
            size--;
            return;
        }
    }

    // reverse LinkedList
    public void reverse() {
        Node prev = null;
        Node next;
        Node curr = tail = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // mid node
    public Node midNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // check palindrome
    public boolean checkPalindrome() {
        if (head == null || head.next == null)
            return true;

        // find mid node
        Node mid = midNode(head);

        // reverse second half
        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // right half head
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.removeFirst();
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(50);
        list.addFirst(10);

        list.addLast(50);
        list.addLast(40);
        list.addLast(30);
        list.addLast(20);
        list.addLast(10);

        list.print();
        System.out.println(list.checkPalindrome());
    }
}
