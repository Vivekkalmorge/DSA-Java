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
    int height(TreeNode root){
     if (root == null) return 0; 

      int leftHeight = height(root.left);
      int rightHeight = height(root.right);

      return Math.max(leftHeight,rightHeight) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
       if (root == null) return 0; 
       
       int left = diameterOfBinaryTree(root.left);
       int right = diameterOfBinaryTree(root.right);
       int diameterHeight = height(root.left) + height(root.right);

      return Math.max(diameterHeight,Math.max(left,right));
    }
}