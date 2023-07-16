import java.util.PriorityQueue;

public class MinCostOfConnectingTwoRods {
    public static int minCost(int arr[]) {
        int minCost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int a : arr)
            pq.add(a);
        while (pq.size() > 1) {
            int f = pq.remove();
            int s = pq.remove();
            minCost += (f + s);
            pq.add(f + s);
        }
        return minCost;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(minCost(arr));
    }
}
