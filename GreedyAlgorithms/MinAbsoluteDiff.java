package GreedyAlgorithms;

import java.util.*;

public class MinAbsoluteDiff {
    public static List<List<Integer>> minAbsList(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                min = diff;
                ans.clear();
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (diff == min) {
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 3 };
        System.out.println(minAbsList(arr));
    }
}
