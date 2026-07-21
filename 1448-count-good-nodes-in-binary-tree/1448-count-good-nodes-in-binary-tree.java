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
    int count = 0;
    public int goodNodes(TreeNode root) {
        if (root == null) {
            return count;
        }
        count++;

        dfs(root.left, root.val);
        dfs(root.right, root.val);

        return count;
    }

    public void dfs(TreeNode root, int maxSoFar) {
        if (root == null) {
            return;
        }
        if (isGoodNode(root.val, maxSoFar)) {
            count++;
        }

        int newMax = Math.max(maxSoFar, root.val);

        dfs(root.left, newMax);
        dfs(root.right, newMax);
    }

    public boolean isGoodNode(int rootVal, int max) {
        if (rootVal>=max) {
            return true;
        }
        return false;
    }
}