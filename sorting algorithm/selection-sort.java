class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int min_ind = i;
        for(int j = i+1; j < arr.length; j++){
            if(arr[j] < arr[min_ind])
                min_ind = j;
        }
        return min_ind;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i = 0; i < n-1; i++){
	        int min_ind = select(arr, i);
	        
	        int temp = arr[i];
	        arr[i] = arr[min_ind];
	        arr[min_ind] = temp;
	    }
	}
}
