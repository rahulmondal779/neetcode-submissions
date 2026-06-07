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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return dfsString(root);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] token = data.split(",");
        int[] index = new int[]{0};
        return dfsTree(token, index);
    }

    public String dfsString(TreeNode root) {
        if (root == null) {
            return "null";
        }

        String leftSubtree = dfsString(root.left);
        String rightSubtree = dfsString(root.right);
        StringBuilder nodeTree = new StringBuilder();
    
        nodeTree.append(root.val).append(",")
                .append(leftSubtree).append(",")
                .append(rightSubtree);

        return nodeTree.toString();
    }

    public TreeNode dfsTree(String[] token, int[] index) {
        if (index[0] >= token.length || token[index[0]].equalsIgnoreCase("null")) {
            index[0]++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(token[index[0]]));
        index[0]++;

        root.left = dfsTree(token, index);
        root.right = dfsTree(token, index);

        return root;
    }
}
