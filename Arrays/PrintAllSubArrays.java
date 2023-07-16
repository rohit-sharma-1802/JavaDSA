public class PrintAllSubArrays {

    public static void printPairs(int a[]) {
        int maxSum = Integer.MIN_VALUE;
        int n = a.length;
        int prefix[] = new int[a.length];
        prefix[0] = a[0];

        // calculating prefix sum of the array
        for (int i = 1; i < prefix.length; i++)
            prefix[i] = prefix[i - 1] + a[i];

        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println("Max Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        printPairs(arr);
    }
}
