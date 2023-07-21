package GreedyAlgorithms;

import java.util.*;

public class CoinChange {
    public static int minCoins(Integer[] coins, int total) {
        int count = 0;
        Arrays.sort(coins, Comparator.reverseOrder());
        int n = coins.length;
        for (int i = 0; i < n; i++) {
            while (coins[i] <= total) {
                total -= coins[i];
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 20, 50, 100, 500, 2000 };
        System.out.println(minCoins(coins, 1059));
    }
}
