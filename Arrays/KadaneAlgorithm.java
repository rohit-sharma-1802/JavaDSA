public class KadaneAlgorithm {
    public static int maxSumSubArray(int a[]) {

        int maxSum = Integer.MIN_VALUE;
        int n = a.length;
        int currSum = 0;
        int negCase = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            currSum += a[i];
            if (currSum < 0)
                currSum = 0;
            negCase = Math.min(a[i], negCase);
            maxSum = Math.max(maxSum, currSum);
        }

        return currSum == 0 ? negCase : maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSumSubArray(arr));
    }
}
