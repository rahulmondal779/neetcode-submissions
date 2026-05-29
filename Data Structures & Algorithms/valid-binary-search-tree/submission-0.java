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
    public boolean isValidBST(TreeNode root) {
        return valid(root, null, null);
    }

    public boolean valid(TreeNode root, Long min, Long max) {
        if (root==null) {
            return true;
        }

        if (min != null && root.val <= min) {
            return false;
        }

        if (max != null && root.val  >= max) {
            return false;
        }

        return valid(root.left, min, (long) root.val) && valid(root.right, (long) root.val, max);
    }
}
