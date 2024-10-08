package dsa.leetcode._226.personal;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        TreeNode result = root;

        if(result != null) {
            TreeNode left = result.left;
            TreeNode right = result.right;

            result.left = right;
            result.right = left;

            invertTree(result.left);
            invertTree(result.right);
        }

        return result;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) { this.val = val; }
        public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }
}
