package Questions;

import java.util.*;

public class MinimumCost {
    public static int minCost(int arr[], int n) {
        int min = 0;
        Arrays.sort(arr);
        while (arr.length > 0) {
            System.out.println(Arrays.toString(arr));
            if (n >= 3) {
                min += Math.max(arr[n - 1], arr[n - 2]);
                arr = Arrays.copyOfRange(arr, 0, n - 2);
            } else {
                min += arr[n - 1];
                arr = Arrays.copyOfRange(arr, 0, n - 1);
            }
            n = arr.length;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 1, 4 };
        int n = arr.length;
        System.out.println(minCost(arr, n));
    }
}
