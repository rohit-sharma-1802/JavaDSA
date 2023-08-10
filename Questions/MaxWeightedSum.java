package Questions;

import java.util.*;

public class MaxWeightedSum {
    public static boolean isPossible(int arr[], int mid, int maxSum) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] + i * mid;
        }
        if (sum <= maxSum)
            return true;
        else
            return false;
    }

    public static int getKForWeightedSum(int arr[], int maxSum) {
        int k = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        int start = min;
        int end = max;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(arr, mid, maxSum)) {
                k = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 2, 7 };
        int maxSum = 33;
        System.out.println(getKForWeightedSum(arr, maxSum));
    }
}
