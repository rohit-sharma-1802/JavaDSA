/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 0;
    private void traverse(TreeNode root, int pathVal){
        if(root == null) return;
        pathVal = pathVal * 10 + root.val;
        if(root.left == null && root.right == null) ans += pathVal;
        traverse(root.left, pathVal);
        traverse(root.right, pathVal);
    }
    public int sumNumbers(TreeNode root) {
        traverse(root, 0);
        return ans;
    }
}
