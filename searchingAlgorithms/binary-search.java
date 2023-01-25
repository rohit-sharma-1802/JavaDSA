class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int mid = 0;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            mid = (low+high)/2;
            if(k == arr[mid])
                return mid;
            else if(k > arr[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
}
