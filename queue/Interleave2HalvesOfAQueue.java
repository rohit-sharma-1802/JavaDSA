import java.util.*;

public class Interleave2HalvesOfAQueue {
    public static void i2hoaq(Queue<Integer> q1) {
        int n = q1.size() / 2;
        Queue<Integer> q2 = new ArrayDeque<>(n);

        // add first half in another queue
        for (int i = 0; i < n; i++)
            q2.add(q1.remove());

        // now add q2 element in the q1 then q1 element remove from q1 and add in last
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
            q1.add(q1.remove());
        }

        while (!q1.isEmpty()) {
            System.out.print(q1.remove() + " ");
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        i2hoaq(q);
    }
}