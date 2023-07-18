package Recursion;

public class FirstOccurenceOfElement {
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length)
            return -1;
        if (key == arr[i])
            return i;
        return firstOccurence(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 6, 5, 3, 2, 7, 4, 7, 5, 3 };
        System.out.println(firstOccurence(arr, 10, 0));
    }
}
