import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[idx];
            arr[idx] = t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
