// Input: 
// N = 5
// arr[] = {4, 1, 3, 9, 7}
// Output: 
// 1 3 4 7 9

class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        boolean swapped = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
                if(swapped == false)
                    break;
            }
        }
    }
}
