// Input: nums = [1,3]
// Output: [3,1]
// Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.

class Solution {
    private TreeNode build(int [] nums, int l, int r){
        if(l > r)
            return null;
        final int m = (l+r)/2;
        return new TreeNode(nums[m], build(nums, l, m-1), build(nums, m+1, r));
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length-1);
    }
}
