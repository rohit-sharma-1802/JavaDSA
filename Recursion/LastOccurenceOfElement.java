package Recursion;

public class LastOccurenceOfElement {

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == 0)
            return -1;
        if (key == arr[i])
            return i;
        return lastOccurence(arr, key, i - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 6, 5, 3, 2, 7, 4, 7, 5, 3 };
        System.out.println(lastOccurence(arr, 7, arr.length - 1));
    }
}
