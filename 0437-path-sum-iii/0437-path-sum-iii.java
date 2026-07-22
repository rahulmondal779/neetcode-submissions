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
    Map<Long, Integer> prefixSum = new HashMap<>();
    public int pathSum(TreeNode root, int targetSum) {
         if (root==null) {
            return 0;
        }
        prefixSum.put(0L, 1);
        
        return dfs(root, 0, targetSum, prefixSum);
    }

    public int dfs(TreeNode root, long currentSum, int targetSum, Map<Long, Integer> prefixSumt) {
        if (root==null) {
            return 0;
        }
        currentSum+=root.val;
        int count = prefixSum.getOrDefault(currentSum - targetSum, 0);
        prefixSum.put(currentSum, prefixSum.getOrDefault(currentSum, 0) + 1);
        count += dfs(root.left, currentSum, targetSum, prefixSum);
        count += dfs(root.right, currentSum, targetSum, prefixSum);
        prefixSum.put(currentSum, prefixSum.get(currentSum) - 1);

        return count;
    }
}