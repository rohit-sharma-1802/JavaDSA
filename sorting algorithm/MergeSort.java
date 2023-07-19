import java.util.Arrays;

public class MergeSort {
    public static void merge(int arr[], int start, int end) {
        if (start >= end)
            return;
        int mid = start + (end - start) / 2;
        merge(arr, start, mid);
        merge(arr, mid + 1, end);
        sort(arr, start, mid, end);
    }

    public static void sort(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (i = 0, k = start; i < temp.length; k++, i++) {
            arr[k] = temp[i];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 8, 7, 1, 6, 2, 9, 0 };
        merge(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
