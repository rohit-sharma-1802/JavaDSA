package BackTracking;

import java.util.Arrays;

public class ArrayBactrack {

    public static void fillArray(int arr[], int i, int val) {

        if (i == arr.length)
            return;

        arr[i] = val;
        fillArray(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        fillArray(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}
