//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
public int[] runningSum(int[] nums){
        for(int i = 0; i < nums.length-1; i++)
            nums[i+1] = nums[i] + nums[i+1]; 
        return nums;
    }
