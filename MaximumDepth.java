/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        
        if(root == null)
            return 0;
            
        int left_height = maxDepth(root.left);
        int right_height = maxDepth(root.right);
        
        if(left_height > right_height)
            return (left_height + 1);
        else 
            return (right_height + 1);
        
    }
}