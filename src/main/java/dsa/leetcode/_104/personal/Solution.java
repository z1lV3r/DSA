package dsa.leetcode._104.personal;

public class Solution {

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        } else if(root.left == null && root.right == null) {
            return 1;
        } else {
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            return (lDepth > rDepth ? lDepth : rDepth) + 1;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
   }
}
