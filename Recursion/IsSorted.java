package Recursion;

public class IsSorted {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1)
            return true;
        return arr[i] < arr[i + 1] && isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6 };
        System.out.print(isSorted(arr, 0));
    }
}
