// Given an integer array nums, find the  subarray with the largest sum, and return its sum.

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int curr = -32767;
        for(int i = 0; i < nums.length; i++){
                sum += nums[i];
                if(sum < nums[i])
                    sum = nums[i];
                if(curr < sum)
                    curr = sum;
        }
        return curr;
    }
}
