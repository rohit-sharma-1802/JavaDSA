import java.util.*;

public class DequeClass {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(20);
        dq.addFirst(10);
        dq.add(30);
        dq.addLast(40);
        System.out.println(dq.removeLast());
        System.out.print(dq.getLast());

    }
}
