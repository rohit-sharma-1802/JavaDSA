public class PrintAllSubArrays {

    public static void printPairs(int a[]) {
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int min = 0;
                int max = 0;
                for (int k = i; k <= j; k++) {
                    // System.out.print(a[k] + ", ");
                    min += a[k];
                    max += a[k];

                }
                if (minSum > min)
                    minSum = min;
                if (maxSum < max)
                    maxSum = max;
            }
        }

        System.out.println("Min Sum: " + minSum);
        System.out.println("Max Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printPairs(arr);
    }
}
