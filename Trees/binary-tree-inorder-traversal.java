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
    public void inOrderSol(TreeNode root, ArrayList<Integer> result){
        if(root != null){
           inOrderSol(root.left,result);
           result.add(root.val);
           inOrderSol(root.right,result);
        } 
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        inOrderSol(root, res);
        return res;
    }


}
