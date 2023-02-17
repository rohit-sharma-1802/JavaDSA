class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int tempArray[] = new int[r-l+1];
         int i = l,j = m+1,k = 0;
         while(i <= m && j <= r){
             if(arr[i] < arr[j]){
                 tempArray[k] = arr[i];
                 i++;
             }
             else{
                 tempArray[k] = arr[j];
                 j++;
             }
             k++;
         }
         
         while(i <= m){
             tempArray[k] = arr[i];
             k++;
             i++;
         }
         while(j <= r){
             tempArray[k] = arr[j];
             k++;
             j++;
         }
         
        k = 0; i = l;
        while(k < tempArray.length){
            arr[i] = tempArray[k];
            k++;
            i++;
        }
         
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        int m = l+(r-l)/2;
        
        if(r > l){
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
}
