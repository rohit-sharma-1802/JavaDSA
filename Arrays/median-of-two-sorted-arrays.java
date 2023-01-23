class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int n;
        int nums[] = new int[length1 + length2];
        int i = 0, k = 0,j = 0;
        while(i < length1 && j < length2 ){
            if(nums1[i] < nums2[j]){
                nums[k] = nums1[i];
                i++;
            }
            else{
                nums[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < length1){
                nums[k] = nums1[i];
                i++;
                k++;
        }
        while(j < length2 ){
            nums[k] = nums2[j];
            j++;
            k++;
        }
        

        int length = nums.length;
        double median = 0;
        n = length/2;
        if(length%2 == 0){
            median = (nums[n-1] + nums[n])/2.0;
        }
        else{
             median = nums[n];
        }
        return median;
    }
}
