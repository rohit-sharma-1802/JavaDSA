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
    public TreeNode minimumNode(TreeNode root){
        if(root.left == null){
            return root;
        }
        else{
            return minimumNode(root.left);
        }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root == null){
            return root;
        }

        if(key < root.val){
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.val){
            root.right = deleteNode(root.right, key);
        }
        else{
            if(root.left != null && root.right != null){
                TreeNode temp = root;
                TreeNode minNodeForRight = minimumNode(temp.right);
                root.val = minNodeForRight.val;
                root.right = deleteNode(root.right, minNodeForRight.val);
            }
            else if(root.left != null){
                root = root.left;
            }
            else if(root.right != null){
                root = root.right;
            }
            else{
               root = null;
            }
        }
        return root;
}
}
