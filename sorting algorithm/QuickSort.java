import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int arr[], int start, int end) {
        if (start >= end)
            return;
        int pIdx = partition(arr, start, end);
        quickSort(arr, start, pIdx - 1);
        quickSort(arr, pIdx + 1, end);
    }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                int temp = arr[j];
                arr[j] = arr[++i];
                arr[i] = temp;
            }
        }
        int temp = pivot;
        arr[end] = arr[++i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 7, 2, 1, 8, 9, 0, 6 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
